package com.amarinag.demon02_recyclerview

class User(
    val id: String,
    val firstName: String,
    val lastName: String,
    val imageUrl: String = "https://upload.wikimedia.org/wikipedia/commons/3/30/Chuck_Norris_May_2015.jpg",
    var password: String = "secret",
)
