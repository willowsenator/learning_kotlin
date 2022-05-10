package functions
fun sum(num1:Int, num2:Int):Int{
    return num1 + num2
}

fun sum(num1:Int, num2:Int,num3:Int):Int{
    return num1 + num2 + num3
}

fun main(){
    println(sum(1,2))
    println(sum(-4,6,7))
}

