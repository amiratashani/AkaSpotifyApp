# AkaSpotifyApp
The basic music player app in Android using the MVVM architecture. This app will have a similar design as Spotify and it will also be designed in a way that is easily extendable with more features.
# Introduction
It leverages the following components from the Jetpack library:

-   [ViewModel](https://developer.android.com/topic/libraries/architecture/viewmodel)
-   [LiveData](https://developer.android.com/topic/libraries/architecture/livedata)
-   [Navigation](https://developer.android.com/topic/libraries/architecture/navigation/)
-   [Kotlin coroutines](https://developer.android.com/topic/libraries/architecture/coroutines)

Use their library in app:

- [Timber](https://github.com/JakeWharton/timber)  : This is a logger.
- [Dagger-Hilt](https://developer.android.com/training/dependency-injection/hilt-android)  : A fast dependency injector.
- [Glide](https://github.com/bumptech/glide): A fast and efficient open-source media management and image loading framework for Android.
- [ExoPlayer](https://github.com/google/ExoPlayer): ExoPlayer is an application-level media player for Android. It provides an alternative to Android’s MediaPlayer API for playing audio and video both locally and over the Internet.

**This app used the** [**FirebaseFirestore**](https://firebase.google.com/docs/firestore) **and** [**FirebaseStorage**](https://firebase.google.com/docs/storage) 

# The App Scenario:
This app follows the client/server architecture as [described in the "how to build an audio app" official documentation](https://developer.android.com/guide/topics/media-apps/audio-app/building-an-audio-app).

Once the application is run, the song models are extracted from the cloud storage, and as each song is played, the music service starts working.  
The songs are played online and non-stop, and Exoplayer does this for us.

**MusicService :**
<p align="center">
 <img src=" https://github.com/amiratashani/AkaSpotifyApp/raw/master/screenshots/MusicService.png"/>
  </p>
  
  **The media session and controller :**
 <p align="center">
  <img src="  https://github.com/amiratashani/AkaSpotifyApp/raw/master/screenshots/MediaController.png"/>
 </p>
 
## Screenshots
<p align="center">
 <img src="https://github.com/amiratashani/AkaSpotifyApp/raw/master/screenshots/HomeFragment.PNG" width="300" height="500" />
 <img src="https://github.com/amiratashani/AkaSpotifyApp/raw/master/screenshots/SongFragment.PNG" width="300" height="500" />
 <img src="https://github.com/amiratashani/AkaSpotifyApp/raw/master/screenshots/SongNotification.PNG" width="300" height="500" />
 </p>

