package com.amarinag.demon02_recyclerview

class User(
    val id: String,
    val firstName: String,
    val lastName: String,
    val imageUrl: String = "https://upload.wikimedia.org/wikipedia/commons/3/30/Chuck_Norris_May_2015.jpg",
    var password: String = "secret",
)

/*fun userJsonToUser(userJson: UserJson): User =
     User(
        userJson.email,
        userJson.name.first,
        userJson.name.last,
        userJson.picture.medium
    )*/

fun UserJson.toUser(): User =
    User(
        this.email,
        this.name.first,
        this.name.last,
        this.picture.medium
    )
fun List<UserJson>.toUser(): List<User> =
    this.map { userJson -> userJson.toUser() }