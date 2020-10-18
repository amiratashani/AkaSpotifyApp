package com.example.akaspotifyapp.adapters

import com.example.akaspotifyapp.R
import kotlinx.android.synthetic.main.swipe_item.view.*

class SwipeSongAdapter : BaseSongAdapter(R.layout.swipe_item) {
    override fun onBindViewHolder(holder: SongViewHolder, position: Int) {
        val song = getItem(position)
        holder.itemView.apply {
            val text = "${song.title} - ${song.subtitle}"
            tvPrimary.text = text

            setOnClickListener {
                clickListener?.onClick(song)
            }
        }
    }

}