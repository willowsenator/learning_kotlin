package arrays

fun main(){
    val maxSize = 4;
    val array1 = Array(maxSize){0}
    val array2 = Array(maxSize){0}
    val arrayResult = Array(maxSize){0}

    for(i in array1.indices){
        print("Enter element $i for array1: ")
        array1[i] = readLine()!!.toInt()
    }

    for(i in array2.indices){
        print("Enter element $i for array2: ")
        array2[i] = readLine()!!.toInt()
    }

    for(i in 0 until maxSize){
        arrayResult[i] = array1[i] + array2[i]
    }

    for(i in arrayResult.indices){
      println("arrayResult[$i]: " + arrayResult[i])
    }



}