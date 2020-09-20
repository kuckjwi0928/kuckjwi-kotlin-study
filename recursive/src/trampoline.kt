sealed class Bounce<A>
data class Done<A>(val result: A): Bounce<A>()
data class More<A>(val thunk: () -> Bounce<A>): Bounce<A>()

tailrec fun <A> trampoline(bounce: Bounce<A>): A = when(bounce) {
    is Done -> bounce.result
    is More -> trampoline(bounce.thunk())
}

fun odd(n: Int): Bounce<Boolean> = when (n) {
    0 -> Done(false)
    else -> More { odd(n - 1) }
}

fun even(n: Int): Bounce<Boolean> = when (n) {
    0 -> Done(true)
    else -> More { even(n - 1) }
}

fun main() {
    println(trampoline((odd(999999))))
    println(trampoline((even(999999))))
}