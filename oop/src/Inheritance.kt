class Human {
    fun greetings(){
        println("Hi everybody")
    }
}

open class Dog{
    fun bark(){
        println("Guauuu Guauuu")
    }
}

class Spaniel : Dog(){
    fun draggingEars(){
        println("Dragging ears")
    }
}

fun main() {
    val spaniel = Spaniel()
    spaniel.bark()
    spaniel.draggingEars()

    val human = Human()
    human.greetings()
}