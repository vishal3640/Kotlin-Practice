fun main()
{
    val x:Int=6
    val y:Int=10

    val graterVal=x greaterValue y
    println(graterVal)
}
 infix fun Int.greaterValue(other:Int):Int{
     if(this>other)
       return this
     else
         return other

 }