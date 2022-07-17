package oop

fun ArrayList<String>.intercambiar(index1:Int, index2:Int){
    val temporal = this[index1]
    this[index1] = this[index2]
    this[index2] = temporal
}

fun main(){
    val list = ArrayList<String>()
    list.add("Seven")
    list.add("Five")
    list.add("Nine")

    println(list)
    list.intercambiar(1, 2)
    println(list)
}