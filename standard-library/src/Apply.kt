fun main() {
    val person = Person("kuckjwi", 29)
    val result = person.apply {
        name = "kotlin"
        age = 10
    }
    println(result)
}
