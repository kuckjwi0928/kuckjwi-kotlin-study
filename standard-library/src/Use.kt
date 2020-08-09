import java.io.FileInputStream
import java.util.*

fun main() {
    val property = Properties()
    FileInputStream("resources/config.properties").use {
        property.load(it)
    }
    println(property)
}
