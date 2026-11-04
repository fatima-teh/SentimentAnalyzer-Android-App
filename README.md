
# SentimentAnalyzer — Android App Using TensorFlow Lite

## 1. Project Overview

SentimentAnalyzer is an Android application developed using Kotlin and Android Studio. It uses a TensorFlow Lite text-classification model to analyze user-entered text and display a sentiment prediction.

This project demonstrates how machine learning can be integrated into an Android application for on-device inference.

## 2. Features

- Users can enter text for sentiment analysis.
- Uses a TensorFlow Lite model for text classification.
- Displays the predicted sentiment.
- Provides a simple and user-friendly Android interface.
- Supports testing with positive and negative text examples.

## 3. Technologies Used

- Android Studio
- Kotlin
- XML
- TensorFlow Lite
- TensorFlow Lite Task Text Library

## 4. Project Structure

```text
SentimentAnalyzer/
├── app/
│   └── src/
│       └── main/
│           ├── assets/
│           │   └── sentiment_model.tflite
│           ├── java/
│           │   └── com/example/sentimentanalyzer/
│           │       └── MainActivity.kt
│           └── res/
│               └── layout/
│                   └── activity_main.xml
├── gradle/
├── README.md
├── build.gradle.kts
└── settings.gradle.kts
```

Note: The actual directory structure and Gradle filenames may vary depending on the project configuration.

## 5. Model Information

The application uses the following TensorFlow Lite model:

**Model File:** `sentiment_model.tflite`

**Model Location:**
```text
app/src/main/assets/sentiment_model.tflite
```

**Original Model Source:**

https://storage.googleapis.com/download.tensorflow.org/models/tflite/text_classification/text_classification_v2.tflite

The model is integrated into the Android application to perform text classification directly on the device.

Model accuracy and training details have not been independently measured or verified as part of this project.

## 6. Dependencies

The project uses the following TensorFlow Lite Task Text dependency:

```gradle
implementation 'org.tensorflow:tensorflow-lite-task-text:0.4.4'
```

Note: The dependency declaration syntax may differ depending on whether the project uses Groovy or Kotlin DSL.

## 7. Requirements

- Android Studio
- Android SDK compatible with the project configuration
- Android phone or emulator
- Internet connection for downloading dependencies during initial setup, if required

## 8. How to Run the Project

1. Clone or download this repository.
2. Open the project in Android Studio.
3. Wait for Gradle synchronization to complete.
4. Connect an Android phone with USB debugging enabled or start an emulator.
5. Select the connected device in Android Studio.
6. Click the Run button.
7. Enter text into the application.
8. View the predicted sentiment displayed on the screen.

## 9. Testing

The application was tested on an Android phone using positive and negative text examples.

Testing includes:

- Entering positive sentences.
- Entering negative sentences.
- Checking the predicted sentiment.
- Verifying that the application displays the prediction.

Screenshots of the application and prediction results are included in the assignment evidence.

## 10. Limitations

- Predictions depend on the capabilities of the selected model.
- Sarcasm and ambiguous wording may affect prediction results.
- Context-dependent sentences may be classified incorrectly.
- Model accuracy has not been independently benchmarked.
- Supported languages and input limitations depend on the selected model.

## 11. Original Repository Studied

The following GitHub repository was used as a reference for understanding TensorFlow Lite integration in Android applications:

https://github.com/Uzair390-Del/NumberGuessingAppTflite

The original repository was studied and executed to understand how a TensorFlow Lite model can be integrated into an Android application.

The original application predicts numerical values, whereas SentimentAnalyzer performs text classification. Both applications demonstrate the use of on-device machine learning in Android.

## 12. Screenshots

The following screenshots should be included in the project documentation:

1. Application interface.
2. Positive sentiment prediction.
3. Negative sentiment prediction.
4. Relevant source code and model integration.

## 13. Author Information

- **Student Name:** Fatima Tehreem
- **Registration Number:** 242201073
- **Course Name:** Mobile App
- **Instructor:** Sir Uzair Hassan
- **Institution:** KICSIT

## 14. Acknowledgements

This project was developed for academic purposes as part of the Android application development assignment.

Acknowledgement is given to the original GitHub repository and TensorFlow Lite resources used during development.

---

**Project:** SentimentAnalyzer  
**Platform:** Android  
**Language:** Kotlin  
**Machine Learning Framework:** TensorFlow Lite
