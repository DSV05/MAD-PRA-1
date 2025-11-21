import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)
    print("Enter Number:")

    val number = reader.nextInt()

    if (number < 0) {
        println("Factorial is not defined for negative numbers.")
    } else {
        // Calculate factorial using a regular recursive function
        val factorialResult = factorial(number)
        println("Factorial of $number = $factorialResult")

        // Calculate factorial using a tail-recursive function
        val tailrecFactorialResult = tailFactorial(number)
        println("By TailRec Keyword, Factorial of $number = $tailrecFactorialResult")
    }
}

fun factorial(n: Int): Long {
    return if (n == 0 || n == 1) {
        1
    } else {
        n * factorial(n - 1)
    }
}

tailrec fun tailFactorial(n: Int, accumulator: Long = 1): Long {
    return if (n == 0 || n == 1) {
        accumulator
    } else {
        tailFactorial(n - 1, accumulator * n)
    }
}
