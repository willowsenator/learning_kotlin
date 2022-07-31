package loops

fun main(){
    printMultiples(8, 400)
}
fun printMultiples(multipleOf:Int, nums:Int){
    for(num in multipleOf..nums){
        if(num % multipleOf == 0){
            println(num)
        }
    }
}