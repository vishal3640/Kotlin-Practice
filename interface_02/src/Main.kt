fun main()
{
    var mybtn=MyButton()
    mybtn.onClick()
    mybtn.onTouch()
}
interface MyInterfaceListener{
    fun onTouch()
    fun onClick()  //normal method public and open default
    {
        println("MyInterfaceListner:onClick")
    }
}
interface MySecondInterface{
    fun onTouch()
    {
        println("MySecondInterface:onTouch")
    }
    fun onClick()
    {
        println("MySecondInterface:onClick")
    }
}
class MyButton:MyInterfaceListener,MySecondInterface{
    override fun onClick()
    {
        super<MyInterfaceListener>.onClick()
        super<MySecondInterface>.onClick()

    }
    override fun onTouch()
    {
        super.onTouch()
    }
}