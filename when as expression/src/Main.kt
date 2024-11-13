fun main()
{
    val x=100
    var str:String=when(x){
        1->"x is 1"
        2->"x is 2"
        else->{
            "x is unknown"
            "x is an alien"
        }
    }
    println(str)
}