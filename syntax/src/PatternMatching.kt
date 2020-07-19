data class Person(val name: String, val age: Int)

fun checkValue(value: Any) = when (value) {
    "kotlin" -> value
    in 1..10 -> "1..10"
    11, 15 -> "11 or 15"
    is Person -> "Person"
    else -> "SomeValue"
}

fun checkCondition(value: Any) = when {
    value == "kotlin" -> value
    value in 1..10 -> "1..10"
    value === Person("kuckjwi", 29) -> "=== User"
    value == Person("kuckjwi", 29) -> "== User"
    value is Person -> "is Person"
    else -> "SomeValue"
}

fun main() {
    println(checkValue("kotlin"))
    println(checkValue(5))
    println(checkValue(15))
    println(checkValue(Person("kuckjwi", 29)))
    println(checkValue("random!"))
    println(checkCondition("kotlin"))
    println(checkCondition(5))
    println(checkCondition(15))
    println(checkCondition(Person("kuckhwan", 29)))
    println(checkCondition("random!"))
}
