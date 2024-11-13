fun main()
{
    /*
    val a=2
    val b=5
    var maxvalue:Int
    if(a>b)

           maxvalue = a
        else
            maxvalue = b
        println(maxvalue)

     */
    val a=2
    val b=5
    var maxvalue:Int=if (a > b) {
        print("a is grater")
        a
    }
    else {
        print("b is greater" )
        b
    }
    println(maxvalue)

}