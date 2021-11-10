package com.amarinag.demon02_recyclerview

import com.google.gson.annotations.SerializedName

data class UserResult(
    @SerializedName("results")
    var users: List<UserJson>
)

data class UserJson(
    var name: FullName,
    var email: String,
    var picture: Picture
)


data class FullName(
    var title: String,
    var first: String,
    var last: String
)

data class Picture(
    var large: String,
    var medium: String,
    var thumbnail: String
)