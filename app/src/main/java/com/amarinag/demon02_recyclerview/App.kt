package com.amarinag.demon02_recyclerview

import android.app.Application
import android.widget.ImageView
import androidx.constraintlayout.helper.widget.MotionPlaceholder
import com.squareup.picasso.Picasso

class App : Application() {
    val users: MutableList<User> = mutableListOf()
//  User(1, "user #1", "https://i.imgur.com/DvpvklR.png"),
//  User(2, "user #2", "https://upload.wikimedia.org/wikipedia/commons/3/30/Chuck_Norris_May_2015.jpg"),
//  User(3, "user #3", "https://i.imgur.com/DvpvklR.png"),
//  User(4, "User #6", "https://i.imgur.com/DvpvklR.png")
}

fun ImageView.imageUrl(url: String, placeholder: Int = R.mipmap.ic_launcher){
    Picasso.get()
        .load(url)
        .placeholder(placeholder)
        .into(this)
}