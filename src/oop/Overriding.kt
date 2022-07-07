package oop

open class Alien{
    open fun greetings(){
        println("Hi human")
    }
}
class Mars:Alien(){
    override fun greetings(){
        println("Hi human. I am a Martian.")
    }
}

fun main() {
    var alien = Alien()
    alien.greetings()
    alien = Mars()
    alien.greetings()
}