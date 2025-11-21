fun main() {
    val intValue: Int = 10
    val doubleFromInt: Double = intValue.toDouble()
    val stringValue: String = "10"
    val intFromString1: Int = stringValue.toInt()
    val intFromString2: Int = "10".toInt()
    val doubleFromString: Double = "11.12".toDouble()

    println("Integer Value:$intValue")
    println("Double Value (From Integer):$doubleFromInt")
    println("String Value:$stringValue")
    println("Integer Value1 (From String):$intFromString1")
    println("Integer Value2 (From String):$intFromString2")
    println("Double Value (From String):$doubleFromString")
}
