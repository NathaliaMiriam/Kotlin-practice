interface Selvagem {
    fun atacar() {
        println("Posso ou não ter corpo")
    }
}
abstract class Mamifero2(val nome: String) {
    fun abrirOlhos() {
        println("Acordei!")
    }
    fun fecharOlhos() {
        println("Indo dormir!")
    }

    abstract fun falar()

}
class Cachorro2(nome: String) : Mamifero2(nome), Selvagem {
    override fun falar() {
        TODO("Not yet implemented")
    }
}

//consigo ter várias implementações de interface numa classe:
interface inter1
interface inter2

class TesteInterfaces : inter1, inter2

fun main() {

}
