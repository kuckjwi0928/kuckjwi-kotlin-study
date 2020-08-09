fun main() {
    val person = Person("kuckjwi", 29)
    val result = person.let {
        it.name = "kuckjwi2"
        it.age = 20
        it
    }
    println(result)

    val user: User? = User("kuckhwan", "cho")
    val fullName = user?.let { it.lastName + it.firstName } ?: "who are you?"
    println(fullName)
}
