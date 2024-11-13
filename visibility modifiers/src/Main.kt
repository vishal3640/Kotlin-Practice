fun main(){

}
open class Person{
    private val a=1
    protected val b=2
    internal val c=3
    val d=10

}
class Indian:Person()
{
    //a is not visible
    //b,c,d are not visible

    fun test(){
        println(b)
    }
}