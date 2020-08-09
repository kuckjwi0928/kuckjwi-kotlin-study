class Box<T>(t: T) {
    var value = t
}

fun main() {
    val box = Box("kotlin")
    println(box.value)
    println(head(listOf(1, 2, 3, 4)))
}

fun <T> head(list: List<T>): T {
    if (list.isEmpty()) {
        throw NoSuchElementException()
    }
    return list[0]
}