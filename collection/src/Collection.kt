fun main() {
    // immutable list
    val list: List<Int> = listOf(1, 2, 3, 4, 5)
    val newList: List<Int> = list.plus(6)
    println(list)
    println(newList)

    // mutable list
    val mutableList: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5)
    println(mutableList)
    mutableList.add(6)
    println(mutableList)

    // immutable map
    val map = mapOf(1 to "One", 2 to "Two")
    val map2 = map.plus(Pair(3, "Three"))
    println(map)
    println(map2)

    // mutable map
    val mutableMap = mutableMapOf(1 to "One", 2 to "two")
    mutableMap[3] = "Three"
    println(mutableMap)
}
