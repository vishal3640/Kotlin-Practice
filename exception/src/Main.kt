fun readNextInt(): Int {
    return readln().toInt()
}

fun runIncrementer() {
    val increment = 1 + readNextInt()
    println(increment)
}

fun main() {
    runIncrementer()
}