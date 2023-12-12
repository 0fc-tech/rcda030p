package com.example.mod3kotlin

import java.time.LocalDateTime

fun main() {
    //Fonction d'extension
    fun LocalDateTime.afficherHm() =
        "Il est ${hour}h${minute}m"


    val now = LocalDateTime.now()
    println(now.afficherHm())
    //Collections
    val couleurs = mutableListOf(
        "bleu", "rouge", "vert", "vert",
        "jaune", "marron", "rose")
    // couleurs += "element2"
    //couleurs.add("coi=sdf")
    val vertCount = couleurs.filter {
        it == "vert"
    }.count()
    //On nomme le paramètre color au lieu de "it"
    val jauneCount = couleurs.filter {color->
        color == "jaune"
    }.count()
    print("jaune${jauneCount} vert${vertCount}")
}