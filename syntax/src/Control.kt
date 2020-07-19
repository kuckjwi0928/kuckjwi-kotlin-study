import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    scanner.use {
        val x: Int = scanner.nextInt()
        val y: Int = scanner.nextInt()

        val max: Int = if (x > y) x else y

        println("Max value is $max")

        val z: Int = scanner.nextInt()

        val numType: String = when {
            z == 0 -> "zero"
            z > 0 -> "positive"
            else -> "negative"
        }

        println(numType)
    }
}