fun main(){
    var dog=Dog("black","pug")
}
open class Animal(color:String){ //super class
    init{
        println("from animal init: $color")
    }
}
class Dog(color:String, breed:String): Animal(color){
    init{
        println("from dog:$color and $breed")
    }
}