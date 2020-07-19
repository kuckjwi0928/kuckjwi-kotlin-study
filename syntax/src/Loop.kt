fun main() {
    val collection = listOf(1, 2, 3)

    for (item in collection) {
        println(item)
    }

    for ((index, item) in collection.withIndex()) {
        println("index $index item $item")
    }

    for (i in 1..3) {
        println(i)
    }

    for (i in 1 until 3) {
        println(i)
    }

    for (i in 6 downTo 0 step 2) {
        println(i)
    }
}