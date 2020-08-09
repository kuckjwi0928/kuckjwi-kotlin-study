fun main() {
    val person = Person("kuckjwi", 29)
    val result = person.also {
        it.name = "kotlin"
        it.age = 10
    }
    println(result)
}
