interface Person{
    fun starost(): Int
    fun zemlja(): String
}
open class Developer(val ime:String,val prezime:String,val godine:Int,val zemlja:String,val progJezik: String): Person{

}
open class BackendDeveloper(): Developer(){

}
open class FrontendDeveloper(): Developer(){

}