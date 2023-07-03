# Superhero Android App

This is an Android application where users can select a superhero from a list. Upon selection, users will be presented with interstitial and rewarded advertisements from Google AdMob.

## Getting Started

These instructions will help you get a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

- Android Studio (3.0 or later)
- Android SDK (API level 21 or later)

### Installing

1. Clone this repository
    ```
    git clone https://github.com/CodrCam/SuperheroApp.git
    ```

2. Open the project in Android Studio
3. Run the app on an emulator or real device

## Built With

- [Java](https://www.java.com/en/download/faq/develop.xml) - The programming language used
- [AdMob](https://admob.google.com/home/) - Google's mobile app advertising platform for monetizing and promoting apps

## Project Structure

- MainActivity: The main activity where users can select a superhero from a list.
- SuperheroAdapter: A custom RecyclerView adapter for displaying the list of superheroes.
- activity_main.xml: The layout file for MainActivity.

## Usage

The application presents a list of superheroes to the user. Each superhero is represented as a button. When a button is clicked, an interstitial ad is displayed. The user can also opt to view a rewarded ad, after which they receive a reward displayed on the screen.

## Note

Please replace the AdMob ad unit IDs in MainActivity.java with your actual ad unit IDs. The ones currently in the project are for testing purposes and belong to Google.

## Author

- [Cameron Griffin](https://github.com/CodrCam)