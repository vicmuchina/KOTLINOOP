class Parent(name:String="John Doe", age:Int=0){
    var Name:String
    var Age:Int

    init {
        Name=name
        Age= age
    }

    fun compile(){
        println("student:$Name has $Age years old.")
    }

}

fun main(){
    var a=Parent("Mary Wanjiku",18)
    a.compile()

    var b=Parent("Rose Matilda", 17)
    b.compile()

    var c=Parent()
    c.compile()

}