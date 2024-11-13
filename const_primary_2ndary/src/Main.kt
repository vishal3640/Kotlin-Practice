fun main(){
    var dog=Dog("black","pug")
}
open class Animal{
    var color:String=""
    constructor(color:String){
        this.color=color
        println("from animal :$color")
    }
}
class Dog:Animal{
    var breed:String=""
    constructor(color:String,breed:String):super(color){
        this.breed=breed
        println("from dog:$color and $breed")
    }
}