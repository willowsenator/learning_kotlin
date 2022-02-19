package mathematicalOperations
fun main(){
    print("Enter quantity of items: ")
    var numItems = readLine()?.toInt()

    print("Enter the price of item: ")
    var price = readLine()?.toDouble()

    print("Total Price: " + numItems?.times(price!!))
}

