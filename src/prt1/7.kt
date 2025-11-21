import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)

    // --- 1. Array Creation and Printing ---

    println("\n--- Array Creation and Printing ---")

    // Create Array-1 by using arrayOf() method
    val array1 = arrayOf(10, 90, 60, 80, 100)
    println("Create Array-1 by using arrayOf() method:")
    println(array1.contentDeepToString()) // For 1D array, contentDeepToString() works fine

    // Create Array-2 by using Array<>() with default values (all zeros)
    val array2 = Array<Int>(5) { 0 }
    println("\nCreate Array-2 by using Array<>():")
    println(array2.contentDeepToString())

    // Create Array-3 by using Array<> and Lambda function (initializing with index values)
    val array3 = Array<Int>(8) { i -> i }
    println("\nCreate Array-3 by using Array<> and Lambda function:")
    println(array3.contentDeepToString())

    // Create Array-4 by using IntArray() (primitive int array)
    val array4 = IntArray(4) { 0 }
    println("\nCreate Array-4 by using IntArray():")
    println(array4.joinToString()) // IntArray has joinToString() directly

// Create Array-5 by using intArrayOf() (primitive int array with specified values)
