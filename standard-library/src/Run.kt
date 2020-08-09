fun main() {
    val person = run {
        Person("kuckjwi", 29)
    }
    println(person)
    val result = person.run {
        name = "chokuckhwan"
        age = 30
        this
    }
    println(result)
    val user: User? = null
    val fullName = user?.run { lastName + firstName } ?: "who are you?"
    println(fullName)
}
