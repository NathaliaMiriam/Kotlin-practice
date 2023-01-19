class Mundo(val anoNascimento: Int, var nome: String) {
    var doc: String? = null
    constructor(anoNascimento: Int, nome: String, doc: String) : this(anoNascimento, nome){
        this.doc = doc
    }
    fun dormir() {

    }
    fun acordar() {

    }
}
fun main() {
    var mundo: Mundo = Mundo(2000, "Fulana", "125648862221")

    mundo.acordar()
    mundo.dormir()
    mundo.doc
}
