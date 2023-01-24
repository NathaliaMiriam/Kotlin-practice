abstract class Mamifero(val nome: String) {
    fun abrirOlhos() {
        println("Acordei!")
    }
    fun fecharOlhos() {
        println("Indo dormir!")
    }

    abstract fun falar()
    abstract fun comer()
}

class Cachorro(nome: String) : Mamifero(nome) {
    override fun falar() {
        TODO("Not yet implemented")
    }

    override fun comer() {
        TODO("Not yet implemented")
    }

}

fun main() {

}
