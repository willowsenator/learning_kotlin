package try_catch
fun main(){
    try{
        print("Enter a number: ")
        val num = readLine()!!.toDouble()
        val division = 1 / num
        print("Division: $division")
    }
    catch (e: ArithmeticException){
        print(e.message)
    }
}