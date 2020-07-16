fun main() {
    val fpCalculator = FpCalculator()
    println(fpCalculator.calculate({ num1, num2 -> num1 + num2 }, 3, 1))
    println(fpCalculator.calculate({ num1, num2 -> num1 - num2 }, 3, 1))
    println(fpCalculator.calculate({ num1, num2 -> num1 / num2 }, 3, 1))
    println(fpCalculator.calculate({ num1, num2 -> num1 * num2 }, 3, 1))
}

class FpCalculator {
    fun calculate(calculator: (Int, Int) -> Int, num1: Int, num2: Int): Int {
        return calculator(num1, num2)
    }
}
