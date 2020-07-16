import java.lang.Exception

fun main() {
    val calculator = Calculator()
    println(calculator.calculate('+', 3, 1))
    println(calculator.calculate('-', 3, 1))
    println(calculator.calculate('/', 3, 1))
    println(calculator.calculate('*', 3, 1))
}

class Calculator {
    fun calculate(operator: Char, num1: Int, num2: Int): Int = when (operator) {
        '+' -> num1 + num2
        '-' -> num1 - num2
        '/' -> num1 / num2
        '*' -> num1 * num2
        else -> throw Exception()
    }
}
