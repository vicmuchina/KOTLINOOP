

open class Hospital(departmentHead: String, departmentId: Int){
    var dHead:String
    var dId:Int

    init {

        dHead=departmentHead
        dId=departmentId


    }

}

class dental(departmentHead:String, departmentId: Int) :Hospital(departmentHead, departmentId) {

    var dName:String = "dental"

    fun dental(){
         println("The $dName department is headed by DR.$dHead and has Id$dId")
     }


}


class surgery(departmentHead:String, departmentId: Int) :Hospital(departmentHead, departmentId) {

    var dName:String = "Surgery"

    fun surgery(){
        println("The $dName department is headed by DR.$dHead and has Id:$dId")
    }


}

class general(departmentHead:String, departmentId: Int) :Hospital(departmentHead, departmentId) {

    var dName:String = "General"

    fun general(){
        println("The $dName department is headed by Dr.$dHead and has Id:$dId")
    }


}


fun main(){
    var d=dental("Life",123456789)
    d.dental()

    var s=surgery("Razor",23565265)
    s.surgery()

    var g=general("Strange",465768)
    g.general()

}