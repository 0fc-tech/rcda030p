package com.example.mod3kotlin

var test = "Hello"
fun main(args: Array<String>) {
    println("$test World")
    var valeurInt = 10
    valeurInt = 15

    //NULLABLE
    var marqueTelephone : String? = "sdgfd"
    //marqueTelephone = "gf"
    //Si marqueTelephone n'est pas nulle, récupérer la longueur, sinon -1
    var longueurMarqueTel : Int = marqueTelephone?.length ?: -1


}