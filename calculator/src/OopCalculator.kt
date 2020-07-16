fun main() {
    val plus = OopCalculatorAdapter(Plus())
    val minus = OopCalculatorAdapter(Minus())
    val divide = OopCalculatorAdapter(Divide())
    val multiply = OopCalculatorAdapter(Multiply())

    val num1 = 3
    val num2 = 1

    println(plus.calculate(num1, num2))
    println(minus.calculate(num1, num2))
    println(divide.calculate(num1, num2))
    println(multiply.calculate(num1, num2))
}

interface OopCalculator {
    fun calculate(num1: Int, num2: Int): Int
}

class Plus : OopCalculator {
    override fun calculate(num1: Int, num2: Int): Int {
        return num1 + num2
    }
}

class Minus : OopCalculator {
    override fun calculate(num1: Int, num2: Int): Int {
        return num1 - num2
    }
}

class Divide : OopCalculator {
    override fun calculate(num1: Int, num2: Int): Int {
        return num1 / num2
    }
}

class Multiply : OopCalculator {
    override fun calculate(num1: Int, num2: Int): Int {
        return num1 * num2
    }
}

class OopCalculatorAdapter(private val calculator: OopCalculator) {
    fun calculate(num1: Int, num2: Int): Int {
        return calculator.calculate(num1, num2)
    }
}
