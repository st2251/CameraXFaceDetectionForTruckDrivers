# Face Detection using CameraX and MlKit for Truck Drivers
This is an Android app that detects faces using ML Kit and performs specific actions when a face is detected.

## Getting Started

To get started with the app, follow these instructions:

1. Clone the repository: `git clone https://github.com/st2251/CameraXFaceDetectionForTruckDrivers/tree/main`
2. Open the project in Android Studio.
3. Set up ML Kit by following the [official ML Kit guides](https://developers.google.com/ml-kit/guides).
4. Run the app on an Android device or an emulator.

## Features

- Detects faces using the device's camera (front or back).
- Retrieves the bounding box of the detected face.
- Automatically crops the image to focus on the detected face.
- Sends the cropped image and timestamp to the backend API.

## Dependencies

This project relies on the following dependencies:

- ML Kit: 
- AndroidX CameraX Library: 
- Retrofit Library:
- Gson Library: 


## Usage

Once the app is running on an Android device or emulator, a button will appear ,pressing it will automatically start the camera. The app will continuously analyze the camera feed and detect faces in real-time.

If a face is detected, the app will:

1. Retrieve the bounding box (coordinates) of the detected face.
2. Crop the camera frame based on the bounding box.
3. Send the cropped image and timestamp to the backend API using a `POST` request to `/attendance`.

## Acknowledgements

Special thanks to the following resources:

- [Google ML Kit Documentation](https://developers.google.com/ml-kit)
- [AndroidX CameraX Documentation](https://developer.android.com/training/camerax)

## Contact

For any questions or inquiries, please contact the project maintainers:

- Name: Saurabh Tripathi
- email : ststst2251@gmail.com

Feel free to reach out with any questions or feedback!
