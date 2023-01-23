package extras
//classe de celular com dono, cor, modelo e número e função de ligar para outro número
fun main() {
    var iphoneDaNat: Celular = Celular(
        "Nat",
        "Branco",
        "Iphone16Pro",
        "+5511945427344"
    )

    iphoneDaNat.ligar("+5511961810635")


    var xiaomiDoYan: Celular = Celular(
        "Yan",
        "Preto",
        "MiNoveLight",
        "+5511961810635"
    )

    xiaomiDoYan.trocaDeDono("Teddy")
    println(xiaomiDoYan.toString())
}
data class Celular(
    var dono: String,
    var cor: String,
    var modelo: String,
    var numero: String
) {
    override fun toString(): String {
        return "O dono do ${this.modelo} é ${this.dono}"
    }

    fun ligar(numeroParaLigar: String) {
        println("Ligando para: $numeroParaLigar")
    }

    fun trocaDeDono(novoDono: String) {
        dono = novoDono
        println("${this.modelo} vendido para $novoDono")
    }
}
