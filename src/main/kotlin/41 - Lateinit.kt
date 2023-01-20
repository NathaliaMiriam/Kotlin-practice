class Receita {

    lateinit var instrucoes: String

    fun geraReceita() {
        instrucoes = "Lave as mãos!!"
    }

    //faz a verificação da inicialização:
    fun imprimeReceita() {
        if (!this::instrucoes.isInitialized) {
            instrucoes = "Lave as mãos!!"
        }
    }

}
fun main() {
    var r: Receita = Receita()

    //inicializa a var:
    r.geraReceita()

    println(r.instrucoes)
}
