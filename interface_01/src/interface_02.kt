// Define an interface
interface Animal {
    fun sound() // Abstract method
    fun sleep() {
        println("This animal is sleeping.") // Default implementation
    }
}

// Implementing the interface in a class
class Dog : Animal {
    override fun sound() {
        println("Woof!")
    }
}

class Cat : Animal {
    override fun sound() {
        println("Meow!")
    }
}

fun main() {
    val dog = Dog()
    dog.sound()  // Outputs: Woof!
    dog.sleep()  // Outputs: This animal is sleeping.

    val cat = Cat()
    cat.sound()  // Outputs: Meow!
    cat.sleep()  // Outputs: This animal is sleeping.
}
