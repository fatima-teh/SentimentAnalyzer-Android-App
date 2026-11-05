# SentimentAnalyzer — Android App Using TensorFlow Lite

## 1. Project Overview

SentimentAnalyzer is an Android application developed using Kotlin and Android Studio. It uses a TensorFlow Lite text-classification model to analyze user-entered text and display a sentiment prediction.

This project demonstrates how machine learning can be integrated into an Android application for on-device inference.

## 2. Features

- User can enter text for sentiment analysis.
- Uses a TensorFlow Lite model for text classification.
- Displays the predicted sentiment.
- Includes a simple Android user interface.
- Tested with positive and negative text examples on an Android phone.

## 3. Technologies Used

- Android Studio
- Kotlin
- XML
- TensorFlow Lite
- TensorFlow Lite Task Text library

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
├── build.gradle
└── settings.gradle
```

Note: Actual Gradle filenames and source directories may vary depending on the project configuration.

## 5. Model Information

The application uses the TensorFlow Lite model file:

`sentiment_model.tflite`

Expected model location:

`app/src/main/assets/sentiment_model.tflite`

The model source used during development:

https://storage.googleapis.com/download.tensorflow.org/models/tflite/text_classification/text_classification_v2.tflite

The model is integrated into the Android application for text classification. Model accuracy and training details are not reported because they have not been independently measured or verified for this project.

## 6. Dependency

The project uses the following TensorFlow Lite Task Text dependency:

`org.tensorflow:tensorflow-lite-task-text:0.4.4`

## 7. Requirements

- Android Studio
- Android SDK compatible with the project configuration
- Android phone or emulator
- Internet connection for downloading dependencies during initial setup, if required

## 8. How to Run the Project

1. Download or clone the project repository.
2. Open the project in Android Studio.
3. Wait for Gradle synchronization to finish.
4. Connect an Android phone with USB debugging enabled or start an emulator.
5. Select the device in Android Studio.
6. Click the Run button.
7. Enter text into the application and view the predicted sentiment.

## 9. Testing

The application was run on an Android phone and tested using positive and negative text examples.

Screenshots of the application and its prediction results are included in the assignment evidence.

## 10. Limitations

- Predictions depend on the capabilities of the selected model.
- Sarcasm, ambiguous wording and context-dependent sentences may be classified incorrectly.
- Model accuracy has not been independently benchmarked as part of this project.
- Supported languages and input limitations depend on the model.

## 11. Original Repository Studied

https://github.com/Uzair390-Del/NumberGuessingAppTflite

The original repository was studied and run to understand how a TensorFlow Lite model can be integrated into an Android application.

The original project predicts numerical values, whereas SentimentAnalyzer performs text classification. They are separate applications with different purposes.

## 12. Screenshots

Include the following real screenshots in the assignment report:

- Application interface
- Positive sentiment prediction
- Negative sentiment prediction
- Relevant source code and model integration

## 13. Author Information

- Student Name: [Enter your name]
- Registration Number: [Enter your registration number]
- Course Name: [Enter course name]
- Instructor: [Enter instructor name]
- Institution: [Enter institution name]
# SentimentAnalyzer — Android App Using TensorFlow Lite

## 1. Project Overview

SentimentAnalyzer is an Android application developed using Kotlin and Android Studio. It uses a TensorFlow Lite text-classification model to analyze user-entered text and display a sentiment prediction.

This project demonstrates how machine learning can be integrated into an Android application for on-device inference.

## 2. Features

- User can enter text for sentiment analysis.
- Uses a TensorFlow Lite model for text classification.
- Displays the predicted sentiment.
- Includes a simple Android user interface.
- Tested with positive and negative text examples on an Android phone.

## 3. Technologies Used

- Android Studio
- Kotlin
- XML
- TensorFlow Lite
- TensorFlow Lite Task Text library

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
├── build.gradle
└── settings.gradle
```

Note: Actual Gradle filenames and source directories may vary depending on the project configuration.

## 5. Model Information

The application uses the TensorFlow Lite model file:

`sentiment_model.tflite`

Expected model location:

`app/src/main/assets/sentiment_model.tflite`

The model source used during development:

https://storage.googleapis.com/download.tensorflow.org/models/tflite/text_classification/text_classification_v2.tflite

The model is integrated into the Android application for text classification. Model accuracy and training details are not reported because they have not been independently measured or verified for this project.

## 6. Dependency

The project uses the following TensorFlow Lite Task Text dependency:

`org.tensorflow:tensorflow-lite-task-text:0.4.4`

## 7. Requirements

- Android Studio
- Android SDK compatible with the project configuration
- Android phone or emulator
- Internet connection for downloading dependencies during initial setup, if required

## 8. How to Run the Project

1. Download or clone the project repository.
2. Open the project in Android Studio.
3. Wait for Gradle synchronization to finish.
4. Connect an Android phone with USB debugging enabled or start an emulator.
5. Select the device in Android Studio.
6. Click the Run button.
7. Enter text into the application and view the predicted sentiment.

## 9. Testing

The application was run on an Android phone and tested using positive and negative text examples.

Screenshots of the application and its prediction results are included in the assignment evidence.

## 10. Limitations

- Predictions depend on the capabilities of the selected model.
- Sarcasm, ambiguous wording and context-dependent sentences may be classified incorrectly.
- Model accuracy has not been independently benchmarked as part of this project.
- Supported languages and input limitations depend on the model.

## 11. Original Repository Studied

https://github.com/Uzair390-Del/NumberGuessingAppTflite

The original repository was studied and run to understand how a TensorFlow Lite model can be integrated into an Android application.

The original project predicts numerical values, whereas SentimentAnalyzer performs text classification. They are separate applications with different purposes.

## 12. Screenshots

Include the following real screenshots in the assignment report:

- Application interface
- Positive sentiment prediction
- Negative sentiment prediction
- Relevant source code and model integration

## 13. Author Information

- Student Name: [Fatima Tehreem]
- Registration Number: [242201073]
- Course Name: [Mobile App ]
- Instructor: [Sir Uzair Hassan]
- Institution: [Kicsit]
