data class User(val name: String, val age: Int)

fun main() {
    // object decomposition
    val user: User = User("kuckjwi", 29)

    val (name, age) = user;

    println("name: $name")
    println("age: $age")

    val users = listOf(User("kuckjwi", 29), User("isis", 28))

    for ((name, _) in users) {
        println("name: $name")
    }

    // map decomposition
    val map = mapOf(("kuckjwi" to 1))

    for ((k, v) in map) {
        println("k: $k, v: $v")
    }
}
