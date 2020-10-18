package com.example.akaspotifyapp.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.akaspotifyapp.data.models.Song


abstract class BaseSongAdapter(
    private val layoutId: Int
) : ListAdapter<Song, BaseSongAdapter.SongViewHolder>(SongDiffCallback()) {

    var clickListener: SongListener? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SongViewHolder {
        return SongViewHolder(
            LayoutInflater.from(parent.context).inflate(
                layoutId, parent, false
            )
        )
    }

    class SongViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
}

class SongDiffCallback : DiffUtil.ItemCallback<Song>() {
    override fun areItemsTheSame(oldItem: Song, newItem: Song): Boolean {
        return oldItem.mediaId == newItem.mediaId
    }

    override fun areContentsTheSame(oldItem: Song, newItem: Song): Boolean {
        return oldItem == newItem
    }
}

class SongListener(val onClickListener: (song: Song) -> Unit) {
    fun onClick(song: Song) {
        onClickListener(song)
    }
}








