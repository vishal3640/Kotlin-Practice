fun main()
{
    var dog=Dog()
    dog.eat()

    var cat=Cat()
    cat.eat()

    //var animal=Animal()
    //animal.eat()

}
open class Animal{
    var color:String=""
    open fun eat(){
        println("Animal eat")
    }
}
class Dog:Animal(){
    var breed:String=""
    fun bark(){
        println("bark")
    }
    override fun eat(){
        super.eat()
        println("dog is eating")
    }
}
class Cat:Animal(){
    var age:Int=-1
    fun meow(){
        println("meow")
    }
    override fun eat(){
        println("cat is eating")
    }
}