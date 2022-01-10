package MathematicalOperations

fun main(){
    println("Enter four numbers: ")
    var n1 = readLine()?.toDouble()
    var n2 = readLine()?.toDouble()
    var n3 = readLine()?.toDouble()
    var n4 = readLine()?.toDouble()

    println("Sum $n1 + $n2: " + n1?.plus(n2!!))
    println("Product $n3 * $n4: " + n3?.times(n4!!))
}