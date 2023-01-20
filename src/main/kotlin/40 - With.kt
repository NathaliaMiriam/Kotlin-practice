fun main() {

    val pessoaCriadaParaExecucaoDeTestes = Person(1985, "Frank")

    //sem with
    pessoaCriadaParaExecucaoDeTestes.acordar()
    pessoaCriadaParaExecucaoDeTestes.dormir()

    //com with
    with(pessoaCriadaParaExecucaoDeTestes) {
        acordar()
        dormir()
    }
}

class Person(val anoNascimento: Int, val nome: String) {
    var olhos: String = ""

    fun dormir() {

    }
    fun acordar() {

    }
}
