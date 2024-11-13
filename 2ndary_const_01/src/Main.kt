fun main()
{
var student=Student("vishal",10)
    println(student.id)
}
class Student(var name:String){
    var id:Int=-1
    init{
        println("Student has got a name as $name & id is $id ")
    }
    constructor(n:String,id:Int):this(n) {
        this.id=id
    }

}