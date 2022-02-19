package loops

fun main(){
    var evenNums = 0
    var oddNums = 0
    print("Enter the number of nums: ")
    val numberOfNums = readLine()?.toInt()
    for(index in 1..numberOfNums!!) {
        print("Enter a number: ")
        var num = readLine()?.toInt()
        if(isEven(num!!)){
         evenNums++
        }
        else{
            oddNums++
        }
    }

    println("Total Even Numbers: $evenNums")
    println("Total Odd Numbers: $oddNums")
}

fun isEven(num:Int):Boolean{
    return num % 2 == 0;
}