package com.example.sentimentanalyzer

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import org.tensorflow.lite.task.text.nlclassifier.NLClassifier

class MainActivity : AppCompatActivity() {

    private lateinit var inputText: EditText
    private lateinit var analyzeButton: Button
    private lateinit var resultText: TextView
    private lateinit var resultEmoji: TextView
    private lateinit var resultDescription: TextView

    private var classifier: NLClassifier? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        inputText = findViewById(R.id.inputText)
        analyzeButton = findViewById(R.id.analyzeButton)
        resultText = findViewById(R.id.resultText)
        resultEmoji = findViewById(R.id.resultEmoji)
        resultDescription = findViewById(R.id.resultDescription)

        try {
            classifier = NLClassifier.createFromFile(
                this,
                "sentiment_model.tflite"
            )
        } catch (e: Exception) {
            Toast.makeText(
                this,
                "Model could not load: ${e.localizedMessage}",
                Toast.LENGTH_LONG
            ).show()
        }

        analyzeButton.setOnClickListener {
            val text = inputText.text.toString().trim()

            if (text.isEmpty()) {
                inputText.error = "Please enter some text"
                return@setOnClickListener
            }

            val model = classifier

            if (model == null) {
                resultEmoji.text = "⚠️"
                resultText.text = "Model not loaded"
                resultDescription.text =
                    "Check the TensorFlow Lite model in app/src/main/assets."
                return@setOnClickListener
            }

            try {
                val results = model.classify(text)

                if (results.isEmpty()) {
                    resultEmoji.text = "❓"
                    resultText.text = "No prediction"
                    resultDescription.text = "The model returned no results."
                    return@setOnClickListener
                }

                val best = results.maxByOrNull { it.score }

                if (best == null) {
                    resultEmoji.text = "❓"
                    resultText.text = "No prediction"
                    resultDescription.text = "Please try another sentence."
                    return@setOnClickListener
                }

                val label = best.label.trim().lowercase()
                val confidence = (best.score * 100).toInt()

                when {
                    label.contains("positive") ||
                            label == "pos" ||
                            label == "1" -> {
                        resultEmoji.text = "😊"
                        resultText.text = "Positive Sentiment"
                        resultText.setTextColor(
                            Color.rgb(22, 143, 120)
                        )
                    }

                    label.contains("negative") ||
                            label == "neg" ||
                            label == "0" -> {
                        resultEmoji.text = "😔"
                        resultText.text = "Negative Sentiment"
                        resultText.setTextColor(
                            Color.rgb(205, 75, 100)
                        )
                    }

                    else -> {
                        resultEmoji.text = "🔎"
                        resultText.text = "Model Result"
                        resultText.setTextColor(
                            Color.rgb(80, 75, 150)
                        )
                    }
                }

                resultDescription.text =
                    "Model label: ${best.label}\nAI confidence: $confidence%"

            } catch (e: Exception) {
                resultEmoji.text = "⚠️"
                resultText.text = "Prediction failed"
                resultDescription.text =
                    e.localizedMessage ?: "Please check the model file."
            }
        }
    }

    override fun onDestroy() {
        classifier?.close()
        classifier = null
        super.onDestroy()
    }
}
