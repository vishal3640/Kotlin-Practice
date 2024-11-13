fun main() {
    val zero = 0 // Int
    val one = 1  // Int
    val oneMillion = 1_000_000  // Int

    val twoMillion = 2_000_000L           // Long because it is tagged with L
    val bigNumber = 1_000_000_000_000_000 // Long, Kotlin automatically chooses it (Int is too small)
    val ten: Long = 10                    // Long because the type is specified

    val shortNumber: Short = 15 // Short because the type is specified
    val byteNumber: Byte = 15   // Byte because the type is specified
    println(Int.MIN_VALUE)
    println(Int.MAX_VALUE)
    println(Long.MIN_VALUE)
    println(Int.SIZE_BYTES)
    println(Int.SIZE_BITS)
}