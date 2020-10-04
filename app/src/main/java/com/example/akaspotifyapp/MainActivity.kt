package com.example.akaspotifyapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.lifecycleScope
import com.example.akaspotifyapp.data.remote.MusicDatabase
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val musicDatabase = MusicDatabase()

        GlobalScope.launch {
            val songs = musicDatabase.getAllSongs()
            Log.i("MainActivityCustome", songs.toString())
        }


    }
}