class Functions {
    companion object {
        var name: String = "default name"
    }

    fun printString(message: String) {
        println(message)
    }

    fun printInfo() {
        println("Name: $name")
    }

    fun saveTextToFile(content: String, filename: String = "default.txt") {
        // Code to save content to a file with the specified or default filename
    }
}

fun main() {
    // Create a Dog instance with 4 legs and the name "Sam"
    val dog = Dog(4, "Sam")

    // Print initial information about the dog
    println("Initial Dog Info:")
    println(dog.getInfo())

    // Increment the dog's age
    dog.incrementAge()

    // Print updated information about the dog
    println("\nUpdated Dog Info:")
    println(dog.getInfo())

    // Access the 'name' property using the getter
    println("Dog's Name: ${dog.name}")

    // Create an instance of the Functions class
    val functions = Functions()

    // Call the printString method with a message
    functions.printString("Hello world!")

    // Set the 'name' property of the Functions class using the setter
    Functions.name = "other name"

    // Print information from the Functions class
    functions.printInfo()

    // Save text to a file with a specific filename
    functions.saveTextToFile("file content", "other_filename.txt")

    // Save text to a file using the default filename
    functions.saveTextToFile("file content")

    // Save text to a file with a specific content and parameter name
    functions.saveTextToFile(content = "another content")
}

