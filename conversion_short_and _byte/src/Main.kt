//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    /*
    val floatNumber = 10f
    val doubleNumber = 1.0

   // val shortNumber = floatNumber.toShort() // avoid this
  //  val byteNumber = doubleNumber.toByte()  // avoid this

    val shortNumber = floatNumber.toInt().toShort() // correct way
    val byteNumber = doubleNumber.toInt().toByte()  // correct way
    println(shortNumber)
    println(byteNumber)

*/

    val n = 8     // Int
    val d = 10.09 // Double
    val c = '@'   // Char
    val b = true  // Boolean

    val s1 = n.toString() // "8"
    val s2 = d.toString() // "10.09"
    val s3 = c.toString() // "@"
    val s4 = b.toString() // "true"
    println(s1)
    println(s2)
    println(s3)
    println(s4)

    val b1 = "false".toBoolean() // false
    val b2 = "tru".toBoolean()   // false
    val b3 = "true".toBoolean()  // true
    val b4 = "TRUE".toBoolean()  // true

}