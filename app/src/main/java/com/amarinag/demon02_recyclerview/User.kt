package com.amarinag.demon02_recyclerview

//id, name, password, lastName
class User(
    val id: Int,
    val firstName: String,
    var password: String = "secret",
    var lastName: String? = password + "fff"
)
