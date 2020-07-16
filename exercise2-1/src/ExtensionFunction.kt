import java.util.*

fun main() {
    val reader = Scanner(System.`in`)
    val input: String = reader.nextLine()
    println(input.hello())
}

fun String.hello() = "Hello, $this"
