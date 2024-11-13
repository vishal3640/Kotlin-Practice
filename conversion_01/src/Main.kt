//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val a=2
    val b=23
    val max = if (a > b) {
        println("Choose a")
        a
    } else {
        println("Choose b")
        b
    }
    println(max)
}