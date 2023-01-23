package extras
//classe de carro com modelo, cor, ano e velocidade e funções de acelerar e desacelerar
fun main() {
    var corolla: Carro = Carro(
        "Corolla",
        "Preto",
        2020,
        60
    )

    corolla.acelerar()
    println(corolla.toString())

    corolla.desacelerar()
    corolla.desacelerar()
    println("A velocidade agora é: ${corolla.velocidade}")
}
class Carro(
    var modelo: String,
    var cor: String,
    var ano: Int,
    var velocidade: Int
) {
    override fun toString(): String {
        return "Modelo: ${this.modelo} | Cor: ${this.cor} | Ano: ${this.ano} | Velocidade: ${this.velocidade}"
    }
    fun acelerar() {
        velocidade += 10
    }
    fun desacelerar() {
        velocidade -= 10
    }
}
