//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main()
{

}
class Sample(private var s : String) {
    init {
        s += "B"
    }
    constructor(t: String, u: String) : this(t) {
        this.s += u
    }
}
