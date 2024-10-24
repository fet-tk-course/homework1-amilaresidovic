interface Person{
    fun starost(): Int
    fun zemlja(): String
}
open class Developer(val ime:String,val prezime:String,val godine:Int,val zemlja:String,val progJezik: String): Person{

}
class BackendDeveloper(): Developer(backendFramework){

}
class FrontendDeveloper(): Developer(frontendFramework){

}
fun brojJezika(progJezik: List<String>): Map<String,Int>{

}
fun prosjStarost(progJezik: List<String>): Map<String,Double>{

}