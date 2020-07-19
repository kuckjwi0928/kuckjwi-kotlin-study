interface Foo {
    fun printFoo()
    fun printKotlin() {
        println("Foo Kotlin")
    }
}

interface Bar {
    val bar: Int
    val bar2: Int
        get() = 4

    fun printBar()
    fun printKotlin() {
        println("Bar Kotlin")
    }
}

class FooBarImpl : Foo, Bar {
    override val bar: Int = 3

    override fun printFoo() {
        println("Foo!")
    }

    override fun printBar() {
        println("Bar!")
    }

    override fun printKotlin() {
        super<Foo>.printKotlin()
        super<Bar>.printKotlin()
    }
}

fun main() {
    val foobarImpl = FooBarImpl()
    foobarImpl.printFoo()
    foobarImpl.printBar()
    foobarImpl.printKotlin()

    println(foobarImpl.bar)
    println(foobarImpl.bar2)
}
