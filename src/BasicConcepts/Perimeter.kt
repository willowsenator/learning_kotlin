package BasicConcepts

fun main() {
    print("Enter a number: ")
    var number = readLine()?.toDouble()

    var perimeter = number?.times(4)
    print("The perimeter is: $perimeter")
}
