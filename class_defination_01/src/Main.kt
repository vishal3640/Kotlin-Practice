fun main() {
    var student=Student("vishal")
}
    class Student(_name:String){
        var name:String="dummy"
        init {
            this.name=_name
            println("Student name is $name")
        }
    }
