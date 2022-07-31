package try_catch

import java.io.FileReader
import java.io.FileWriter
import java.nio.file.Files
import java.nio.file.Paths
import kotlin.io.path.Path

fun main(){
    print("Enter a text: ")
    val text = readLine().toString()
    writeFile(text)
    val pathToRead = Paths.get("$DIRECTORY_PATH/test.txt").toString()
    println(pathToRead)
    readFile(pathToRead)
}

fun readFile(path: String) {
    val reader = FileReader(Path(path).toString())
    var character:Int?
    do{
        character = reader.read()
        print(character.toChar())
    }while(character != -1)
}

private const val DIRECTORY_PATH = "try_catch/files"

fun writeFile(text:String){
    try {
        val path = Path(DIRECTORY_PATH)
        if(!Files.exists(path)) {
            Files.createDirectory(Path(path.toString()))
        }
        FileWriter(Path("$DIRECTORY_PATH/test.txt").toString(), true).use { w -> w.write(text + "\n") }
        println("File was written")
    }
    catch (e:Exception){
        print(e.message)
    }
}

