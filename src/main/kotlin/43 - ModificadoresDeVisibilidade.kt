private class X private constructor()
open class Eletronico1(private var marca: String) {

    private val s: String = ""

    private fun ativarCorrente() {}
    fun ligar() {
        ativarCorrente()
    }
    fun desligar() {}
}

class Computador1(marca: String) : Eletronico1(marca) {
    fun isntalaSoftware() {}
    fun processaDados() {}

}

fun main() {

    var c: Computador1 = Computador1(marca = "DELL")

    c.ligar()
    c.desligar()
}
