package logicConditions

fun main(){
    print("Enter a number: ")
    var num1 = readLine()?.toDouble()

    print("Enter another number: ")
    var num2 = readLine()?.toDouble()

    if(num1!! > num2!!){
        println("Sum $num1 + $num2: " + num1.plus(num2))
        println("Substract $num1 - $num2: " + num1.minus(num2))
    }
    else{
        println("Product $num1 * $num2: " + num1.times(num2))
        println("Divide $num1 / $num2: " + num1.div(num2))
    }

    var result = when(num1 > num2){
        true->{
            "Sum $num1 + $num2: " + num1.plus(num2) + "\n"+ "Substract $num1 - $num2: " + num1.minus(num2)
        }
        false->{
            "Product $num1 * $num2: " + num1.times(num2) + "\n" +"Divide $num1 / $num2: " + num1.div(num2)
        }
    }

    print(result)
}