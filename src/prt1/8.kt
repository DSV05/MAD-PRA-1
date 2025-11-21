import java.util.Scanner

// Define the Car class
class Car(
    val type: String,
    val model: Int,
    val price: Double,
    var owner: String,
    var milesDriven: Double
) {

    // Initializer block – called when an object of the class is created
    init {
        println("Object of class is created and Init is called.")
    }

    // Function to get car information
    fun getCarInformation(): String {
        return "$type, $model"
    }

    // Function to get the original car price
    fun getOriginalCarPrice(): Double {
        return price
    }

    // Function to calculate and get the current car price
    fun getCurrentCarPrice(): Double {
        // Simple depreciation logic: 1% depreciation per 100 miles driven
        val depreciationPerMile = price * 0.01 / 100
        return price - (milesDriven * depreciationPerMile)
    }

    // Function to display all car information
    fun displayCarInformation() {
        println("Car Information: ${getCarInformation()}")
        println("Car Owner: $owner")
        println("Miles Drive: ${milesDriven.toInt()}") // Display as integer as in example
        println("Original Car Price: ${getOriginalCarPrice()}")
        println("Current Car Price: ${getCurrentCarPrice()}")
        println("-----------")
    }
}
fun main() {
    val reader = Scanner(System.`in`)

    // --- Creating Car objects and displaying information ---

    println("Creating Car Class Object car1 in next line.")
    val car1 = Car("BMW", 2018, 100000.0, "Aman", 105.0)
    car1.displayCarInformation()

    println("Creating Car Class Object car2 in next line.")
    val car2 = Car("BMW", 2019, 400000.0, "Karan", 20.0)
    car2.displayCarInformation()

    // --- Working with an ArrayList of Car objects ---
    println("\n****** ArrayList of Car ***************")

    val carList = arrayListOf<Car>()

    // Adding cars to the ArrayList

    // Object 1
    println("Object of class is created and Init is called.")
    carList.add(Car("Toyota", 2017, 1080000.0, "KJS", 100.0))

    // Object 2
    println("Object of class is created and Init is called.")
    carList.add(Car("Maruti", 2020, 400000.0, "NEPP", 200.0))

    // Displaying information for cars in the ArrayList
    carList.forEach { car ->
        car.displayCarInformation()
    }

    reader.close()
}
