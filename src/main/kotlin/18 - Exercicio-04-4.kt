//programa para ser usado na portaria de um evento - resolvido by me
fun main() {
    println("Informe a sua idade: ")
    val resposta = readLine()

    if (resposta != null && resposta != "") {
        val idadeUsuario = resposta.toInt()

        if (idadeUsuario >= 18) {
            println("Idade permitida! Informe o tipo de convite: ")
            val conviteUsuario = readLine()

            if (conviteUsuario == "comum" ||
                conviteUsuario == "premium" ||
                conviteUsuario == "luxo") {
                println("Tipo de convite válido! Informe o código: ")
                val codigoUsuario = readln()

                if (codigoUsuario.startsWith("XL") && (conviteUsuario == "premium" || conviteUsuario == "luxo")) {
                    println("Welcome :D")
                } else if (codigoUsuario.startsWith("XT") && conviteUsuario == "comum") {
                    println("Welcome :D")
                } else {
                    println("Negado! Convite inválido.")
                }

            } else {
                println("Negado! Tipo de convite inválido.")
            }

        } else {
            println("Entrada negada! Menores de idade não são permitidos.")
        }
    }
}
