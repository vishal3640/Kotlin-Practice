import kotlin.math.sqrt

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val num: Int = 100

    val res: Double = sqrt(num.toDouble())
    println(res) // 10.0
    println(num) // 100, it is not modified

    val num1:Int=100
    val bigNum:Long=num1.toLong()
    println(bigNum)

     val n1:Int=125
    val ch:Char=n1.toChar()
    val n2:Int=ch.code
    println(ch)
    println(n2)

}