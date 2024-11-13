fun main()
{
    var user1=User("sam",10)
    var user2=User("sam",10)
    println(user1.toString())

    if(user1==user2)
    {
        println("equal")
    }
    else
    {
        println("not equal")
    }
}
 data class User(val name:String,val age:Int)
{

}
