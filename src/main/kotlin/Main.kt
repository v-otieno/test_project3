fun main(){

    val principal=Teacher()

    principal.gender="Female"
    println(" I am a ${principal.gender} principal")
    principal.teach()

    val printInfo=Parent()
    printInfo.name="Mother"
    println("I am a ${printInfo.name} to Anitah")
    printInfo.graduate()
}


open class Parent{
    var name:String=""
    fun graduate(){
        println("graduation is coming up soon")
    }
}
class student:Parent(){

    var age:Int=20
    fun intern(){
        println("I am doing my internship at KEMRI")
    }
}
class Teacher:Parent(){

    var gender:String=""
    fun teach(){
        println("I am teaching coding in kotlin")
    }
}
