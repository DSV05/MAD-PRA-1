import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)

    print("Enter Month Number:")
    val monthNumber = reader.nextInt()

    val monthName = when (monthNumber) {
        1 -> "January"
        2 -> "February"
        3 -> "March"
        4 -> "April"
        5 -> "May"
        6 -> "June"
        7 -> "July"
        8 -> "August"
        9 -> "September"
        10 -> "October"
        11 -> "November"
        12 -> "December"
        else -> "please enter proper number"
    }
    println(monthName)
}
