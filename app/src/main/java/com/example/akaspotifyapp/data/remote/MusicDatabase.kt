package com.example.akaspotifyapp.data.remote

import android.util.Log
import com.example.akaspotifyapp.data.models.Song
import com.example.akaspotifyapp.other.Constants.SONG_COLLECTION
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.coroutines.tasks.await
import timber.log.Timber
import javax.inject.Inject

class MusicDatabase @Inject constructor() {

    private val firestore = FirebaseFirestore.getInstance()
    private val songCollection = firestore.collection(SONG_COLLECTION)


    suspend fun getAllSongs(): List<Song> {
        return try {
            songCollection.get().await().toObjects(Song::class.java)
        } catch (e: Exception) {
            Timber.i(e.toString())
            emptyList()
        }
    }
}