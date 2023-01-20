open class Eletronico(var marca: String) {
    fun ligar() {}
    fun desligar() {}
}

class Computador(marca: String) : Eletronico(marca) {
    fun isntalaSoftware() {}
    fun processaDados() {}

}

fun main() {

    var c: Computador = Computador(marca = "DELL")

    c.ligar()
    c.desligar()
    c.marca
}
