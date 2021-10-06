package com.amarinag.demon02_recyclerview

//id, name, password, lastName
class User(
    val id: Int,
    private val name: String,
    var password: String = "secret",
    var lastName: String? = password + "fff"
)
