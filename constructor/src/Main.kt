// //TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// // click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
// fun main()
// {

// }
// class Sample(private var s : String) {
//     init {
//         s += "B"
//     }
//     constructor(t: String, u: String) : this(t) {
//         this.s += u
//     }
// }
fun main() {
    // Create an object using the primary constructor
    val obj1 = Sample("Hello")
    // Create an object using the secondary constructor
    val obj2 = Sample("Hello", "World")
    
    // Print the results
    println(obj1.getS()) // Access the value of 's' using a getter
    println(obj2.getS()) // Access the value of 's' using a getter
}

class Sample(private var s: String) {
    init {
        s += "B" // Append "B" to 's' in the init block
    }

    constructor(t: String, u: String) : this(t) {
        this.s += u // Append 'u' to 's' in the secondary constructor
    }

    // Provide a getter to access the private 's'
    fun getS(): String {
        return s
    }
}
