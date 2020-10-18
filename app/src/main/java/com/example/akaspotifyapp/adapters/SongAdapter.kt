package com.example.akaspotifyapp.adapters

import com.bumptech.glide.RequestManager
import com.example.akaspotifyapp.R
import kotlinx.android.synthetic.main.list_item.view.*
import javax.inject.Inject

class SongAdapter @Inject constructor(private val glide: RequestManager) :
    BaseSongAdapter(R.layout.list_item) {

    override fun onBindViewHolder(holder: SongViewHolder, position: Int) {
        val song = getItem(position)
        holder.itemView.apply {
            tvPrimary.text = song.title
            tvSecondary.text = song.subtitle
            glide.load(song.imageUrl).into(ivItemImage)

            setOnClickListener {
                clickListener?.onClick(song)
            }
        }
    }

}