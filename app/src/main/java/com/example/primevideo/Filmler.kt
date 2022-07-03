package com.example.primevideo

import java.io.Serializable

data class Filmler(
    var filmId: Int,
    var filmAdi: String,
    var filmResimAdi: String,
    var filmYil: Int,
    var filmSure: Int
) : Serializable {

}
