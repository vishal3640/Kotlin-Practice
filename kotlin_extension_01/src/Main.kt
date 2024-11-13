fun main() {
    var student=Student()
    println("Pass status:"+student.haspassed(57))
    println("sholarship status:"+student.isscholar(98))
}
 fun Student.isscholar(marks:Int):Boolean{
     return marks>95
 }
    class Student{
        fun haspassed(marks:Int):Boolean {
            return marks>40
        }
    }
