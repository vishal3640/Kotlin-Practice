fun main()
{
   // var person=Person()

}
abstract class Person{  //you cannot create instance of abstract class
    abstract var name:String
    abstract fun eat()    //abstract properties are open bydefault
    open fun getHeight(){}    //open function ready to be overriden
    fun goToSchool(){}
}
class Indian:Person(){
    override var name:String="dummy_indian_name"
    override fun eat(){}

}