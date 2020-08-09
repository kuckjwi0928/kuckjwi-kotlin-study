fun List<Int>.head() = first()
fun List<Int>.tail() = drop(1)

fun String.head() = first()
fun String.tail() = drop(1)

fun main() {
    println(sum(5))
    println(power(2, 10))
    println(factorial(5))
    println(max(listOf(1, 3, 100, 8, 4)))
    println(reverse("kuckjwi"))
    println(toBinary(10))
    println(replicate(3, 5))
}

fun sum(n: Int): Int = when {
    n < 0 -> 0
    else -> n + sum(n - 1)
}

fun power(x: Int, n: Int): Int = when {
    n < 1 -> 1
    else -> x * power(x, n - 1)
}

fun factorial(n: Int): Int = when {
    n < 1 -> 1
    else -> n * factorial(n - 1)
}

fun max(list: List<Int>): Int = when {
    list.isEmpty() -> 0
    1 == list.size -> list[0]
    else -> {
        val head = list.head()
        val tail = list.tail()
        val maxVal = max(tail)
        if (head > maxVal) head else maxVal
    }
}

fun reverse(str: String): String = when {
    str.isEmpty() -> ""
    else -> reverse(str.tail()) + str.head()
}

fun toBinary(n: Int): String = n.toString(2)

fun replicate(n: Int, element: Int): List<Int> = when {
    n <= 0 -> listOf()
    else -> listOf(element) + replicate(n - 1, element)
}
