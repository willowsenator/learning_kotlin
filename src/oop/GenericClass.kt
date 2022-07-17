package oop

class Numbers<T>(number:T) {
    init {
        println(number)
    }
}

fun main(){
    Numbers(23)
    Numbers(2.3f)
    Numbers(12.3)
}