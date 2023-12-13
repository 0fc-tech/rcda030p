package com.eniecole.enishop.bo

import java.time.LocalDateTime

data class Article(
    var id:Long,
    var titre : String,
    var description : String,
    var prix : Double,
    var urlImage: String,
    var dateSortie: LocalDateTime
)