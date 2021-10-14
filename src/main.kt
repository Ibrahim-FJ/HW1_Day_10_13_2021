import java.io.File

fun main() {

    println("Type anything to save in file")
    val string = readLine()
    if (string != null) {
        saveToFile(string)
    }

}

// I used printWriter() function to save a file without return value

fun saveToFile(string : String){
    val myFile = File("myFile.txt")
    myFile.printWriter().use { out ->

        out.println(string)
    }

    println("Done")
}