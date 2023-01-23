open class Eletronico2(private var marca: String) {
    private fun corrente(ativo: Boolean) {}
    fun ligar() {
        corrente(true)
    }

    //override:
    open fun desligar() {
        corrente(false)
    }
}
class Computador2(marca: String) : Eletronico2(marca) {
    fun save() {}

    //override:
    override fun desligar() {
        save()
        super.desligar()
    }

    //overload:
    fun stop() {}
    fun stop(a: Int) {}
    fun stop(a: Float) {}
    fun stop(a: Double) {}
    fun stop(a: Int, b: Int) {}

}
fun main() {

    var c: Computador2 = Computador2(marca = "DELL")

    c.ligar()
    c.desligar()
}
