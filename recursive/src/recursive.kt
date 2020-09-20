fun List<Int>.head() = first()
fun List<Int>.tail() = drop(1)

fun String.head() = first()
fun String.tail() = drop(1)

fun main() {
    println(sum(5))
    println(power(2, 10))
    println(powerFP(2, 10))
    println(factorial(8))
    println(max(listOf(1, 3, 100, 8, 4)))
    println(maxFP(listOf(1, 3, 100, 8, 4)))
    println(reverse("kuckjwi"))
    println(toBinary(10))
    println(replicate(3, 5))
    println(take(3, listOf(1, 2, 3, 4, 5)))
    println(elem(3, listOf(1, 2, 3, 4, 5)))
    println(takeSequence(5, repeat(3)))
    println(zip(listOf(1, 3, 5), listOf(2, 4)))
    println(quicksort(listOf(5, 100, 200, 1, 4, 3)))
    println(gcd(1112, 695))
    println(fiboRecursion(6))
    println(fiboMemoization(6))
    println(fiboFP(6))
}

fun sum(n: Int): Int = when {
    n < 0 -> 0
    else -> n + sum(n - 1)
}

fun power(x: Int, n: Int): Int = when {
    n < 1 -> 1
    else -> {
        x * power(x, n - 1)
    }
}

fun factorial(n: Int): Int = when {
    n < 1 -> 1
    else -> {
        n * factorial(n - 1)
    }
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

tailrec fun maxFP(list: List<Int>, acc: Int = Int.MIN_VALUE): Int = when {
    list.isEmpty() -> 0
    1 == list.size -> acc
    else -> {
        val head = list.head()
        val maxVal = if (head > acc) head else acc
        maxFP(list.tail(), maxVal)
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

fun take(n: Int, list: List<Int>): List<Int> = when {
    n <= 0 || list.isEmpty() -> listOf()
    else -> listOf(list.head()) + take(n - 1, list.tail())
}

fun elem(n: Int, list: List<Int>): Boolean = when {
    list.isEmpty() -> false
    n == list.head() -> true
    else -> elem(n, list.tail())
}

fun repeat(n: Int): Sequence<Int> = generateSequence(n) { it }

fun takeSequence(n: Int, sequence: Sequence<Int>): List<Int> = when {
    n <= 0 -> listOf()
    else -> listOf(sequence.first()) + takeSequence(n - 1, sequence)
}

fun zip(list1: List<Int>, list2: List<Int>): List<Pair<Int, Int>> = when {
    list1.isEmpty() || list2.isEmpty() -> listOf()
    else -> listOf(Pair(list1.head(), list2.head())) + zip(list1.tail(), list2.tail())
}

fun quicksort(list: List<Int>): List<Int> = when {
    list.isEmpty() -> listOf()
    else -> {
        val pivot = list.head()
        val partitions = list.tail().partition { pivot > it }
        quicksort(partitions.first) + listOf(pivot) + quicksort(partitions.second)
    }
}

fun gcd(m: Int, n: Int): Int = when (n) {
    0 -> m
    else -> gcd(n, m % n)
}

fun fiboRecursion(n: Int): Int {
    return when (n) {
        0 -> 0
        1 -> 1
        else -> fiboRecursion(n - 2) + fiboRecursion(n - 1)
    }
}

var memo = Array(100) { -1 }

fun fiboMemoization(n: Int): Int =
    when {
        n == 0 -> 0
        n == 1 -> 1
        memo[n] != -1 -> memo[n]
        else -> {
            memo[n] = fiboMemoization(n - 2) + fiboMemoization(n - 1)
            memo[n]
        }
    }

fun fiboFP(n: Int): Int = fiboFP(n, 0, 1)

tailrec fun fiboFP(n: Int, first: Int, second: Int): Int = when(n) {
    0 -> first
    1 -> second
    else -> fiboFP(n - 1, second, first + second)
}

fun powerFP(x: Int, n: Int): Int = powerFP(n - 1, x, x)

tailrec fun powerFP(n: Int, first: Int, second: Int): Int = when(n) {
    0 -> second
    else -> {
        powerFP(n - 1, first, first * second)
    }
}
