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
fun brojJezik(programeri: List<Developer>): Map<String,Int>{

}
fun prosjStarost(programeri: List<Developer>): Map<String,Double>{

}
fun printDeveloperData{

}

fun main() {

    val listaBackendProgramera = listOf(
        BackendDeveloper("Amila", "Residovic", 23, "BiH", "Kotlin i Spring Boot"),
        BackendDeveloper("Ibrahim", "Selimovic", 22, "BiH", "Java i Spring"),
        BackendDeveloper("Edin", "Drapic", 24, "BiH", "Kotlin i Ktor")

    )
    for (programer in listaBackendProgramera) {
        println("${programer.ime} je backend programer koji koristi ${programer.progJezik}")
    }
    val listaFrontendProgramera = listOf(
        FrontendDeveloper("Emina", "Jusufovic", 23, "BiH", "Kotlin i React"),
        FrontendDeveloper("Mujo", "Alic", 22, "BiH", "JavaScript i Vue.js")
    )

    for (programer in listaFrontendProgramera) {
        println("${programer.ime} je frontend programer koji koristi ${programer.progJezik}")
    }
}










