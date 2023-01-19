class Pessoa(val anoNascimento: Int, var nome: String) {
    var olhos: String = ""

    fun dormir() {

    }

    fun acordar() {

    }
}
fun main() {
    var pessoa: Pessoa = Pessoa(2000, "Fulana")

    pessoa.acordar()
    pessoa.dormir()
    pessoa.olhos
}
