data class User(var name: String, var age: Int = 30)

fun main() {
    val user = User("kuckjwi", 29)
    println(user)

    val user2 = User("kuckhwan")
    println(user2)

    // copy
    val userCopy = user.copy()
    println(userCopy === user)

    // componentN
    println(user2.component1())
    println(user2.component2())
}
