package com.example.mod3kotlin

fun main() {
    val enfant1 = Enfant("louis")
    enfant1.getTruc()
    val personne = Personne("Michel")
    personne.getTruc()
}
open class Personne{
    var firstName = ""

    constructor(prenom : String){
        this.firstName = prenom
    }
    open fun getTruc(){
        print("Truc")
    }
}

class Enfant(var name: String) : Personne(name){
    override fun getTruc() {
        //super.getTruc()
        println("Un autre message plutôt que Truc")
    }
}














