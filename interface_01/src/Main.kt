fun main()
{
  var mybtn=MyButton()
    mybtn.onTouch()
    mybtn.onClick()
}
interface MyInterfaceListener {
    var name:String  //properties are interface are abstract by default
    fun onTouch()  //method in interface are abstract are bydefault
    fun onClick(){  //bydefault open
        println("on click interface code :button clicked")
    }
}
class MyButton:MyInterfaceListener{
    override var name:String="vishal"
    override fun onTouch(){
        println("button was touched")
    }
    override fun onClick(){  //optional to override
        super.onClick()
        println("button was clicked")
    }
}