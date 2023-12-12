package com.example.mod3kotlin

fun main() {
    val age = 54
    val message = if (age >= 18) {
        "mur"
    }
    else {
        "mur"
    }
    println(message)
    when(message.length){
        in Int.MIN_VALUE.. 4 -> println("Inféireur ou égal à 4")
        5 -> println("Message long")
        in 6..12 -> println("Entre 6 et 12")
        in 13.. Int.MAX_VALUE -> println("Supérieur à 13")
    }
    val articles = listOf("PS5", "PS4", "MacbookPro 15", "Dell XPS 15")

    for(article in articles) {
        println("article : $article")
    }
    for((key, article) in articles.withIndex()) {
        println("article numéro $key : $article")
    }
}