package com.example.akaspotifyapp.exoplayer

import android.support.v4.media.MediaMetadataCompat
import com.example.akaspotifyapp.data.models.Song

fun MediaMetadataCompat.toSong(): Song? {
    return description?.let {
        Song(
            it.mediaId ?: "",
            it.title.toString(),
            it.subtitle.toString(),
            it.mediaUri.toString(),
            it.iconUri.toString()
        )
    }
}