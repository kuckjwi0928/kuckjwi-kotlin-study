fun main() {
    val person = Person("kuckjwi", 29)
    val result = with(person) {
        name = "kotlin"
        age = 19
        this
    }
    println(result)
}
