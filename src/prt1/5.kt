import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)

    print("Enter first number: ")
    val num1 = reader.nextDouble()

    print("Enter second number: ")
    val num2 = reader.nextDouble()

    print("Choose an operation (+, -, *, /): ")
    val operator = reader.next()

    // Call the user-defined function to perform the calculation
    val result = performArithmetic(num1, num2, operator)

    // Display the result
    if (result != null) {
        println("Addition of $num1, $num2 = ${(num1 + num2)}")
        println("Subtraction of $num1, $num2 = ${(num1 - num2)}")
        println("Multiplication of $num1, $num2 = ${(num1 * num2)}")

        if (num2 != 0.0) {
            println("Division of $num1, $num2 = ${(num1 / num2)}")
        } else {
            println("Division by zero is not allowed.")
        }
    } else {
        println("Error: Invalid operator or division by zero.")
    }
}

fun performArithmetic(num1: Double, num2: Double, operator: String): Double? {
    return when (operator) {
        "+" -> num1 + num2
        "-" -> num1 - num2
        "*" -> num1 * num2
        "/" -> {
            if (num2 != 0.0) {
                num1 / num2
            } else null
        }
        else -> null
    }
}
