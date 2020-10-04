package com.example.akaspotifyapp.data.remote

import android.util.Log
import com.example.akaspotifyapp.data.models.Song
import com.example.akaspotifyapp.other.Constants.SONG_COLLECTION
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.coroutines.tasks.await

class MusicDatabase{

    private val firestore = FirebaseFirestore.getInstance()
    private val songCollection = firestore.collection(SONG_COLLECTION)



    suspend fun getAllSongs(): List<Song> {
        return try {
            songCollection.get().await().toObjects(Song::class.java)
        } catch (e: Exception) {
            Log.i("MainActivityCustome", e.toString())
            emptyList()
        }
    }
}