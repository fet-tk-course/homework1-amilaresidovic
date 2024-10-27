interface Person{
    fun starost(): Int
    fun zemlja(): String
}
open class Developer(val ime:String,val prezime:String,val godine:Int,val zemlja:String,val progJezik: String): Person{
    override fun starost(): Int= godine
    override fun zemlja(): String= zemlja

}
class BackendDeveloper(val ime:String,val prezime:String,val godine:Int,val zemlja:String,val progJezik: String,val backendFramework: String): Developer(ime,prezime,godine,zemlja,progJezik){

}
class FrontendDeveloper(val ime:String,val prezime:String,val godine:Int,val zemlja:String,val progJezik: String,val frontendFramework: String): Developer(ime,prezime,godine,zemlja,progJezik){

}
fun brojJezika(progJezik: List<String>): Map<String,Int>{


}
fun prosjStarost(progJezik: List<String>): Map<String,Double>{

}