package extras
//formulário de acompanhamento de peso com 3 atributos (nome, peso e altura) e funções para subir e descer o peso

data class AcompanhamentoDePeso(
    var nome: String,
    var peso: Float,
    var altura: Float
) {
    fun adicionarPeso(pesoAAcrescentar: Float) {
        peso += pesoAAcrescentar
    }

    fun subtrairPeso(pesoASubtrair: Float) {
        peso -= pesoASubtrair
    }

    override fun toString(): String {
        return "Nome: ${this.nome} | Peso Atual: ${this.peso} | Altura: ${this.altura} "
    }
}

fun main() {
    var formularioDaNat: AcompanhamentoDePeso = AcompanhamentoDePeso(
        "Nathália",
        57.5f,
        1.59f
    )

    println(formularioDaNat.toString())

    formularioDaNat.subtrairPeso(3f)
    println(formularioDaNat.toString())

    formularioDaNat.adicionarPeso(1f)
    println(formularioDaNat.toString())
}
