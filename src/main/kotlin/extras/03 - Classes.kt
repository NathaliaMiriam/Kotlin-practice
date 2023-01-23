package extras
//formulário de abertura de conta bancária com nome, saldo geral e agência
fun main() {
    var conta: ContaBancaria = ContaBancaria(
        "Nathalia Miriam",
        1000,
        Agencias.TAIPAS
    )

    println(conta.toString())
}

enum class Agencias {
    TAIPAS,
    JARAGUA,
    PERUS,
    FREGUESIA_DO_O
}

data class ContaBancaria(
    var nome: String,
    var saldo: Int,
    var agencia: Agencias
) {
    override fun toString(): String {
        return "Proprietário: ${this.nome} | Saldo: ${this.saldo} | Agência: ${this.agencia}"
    }
}
