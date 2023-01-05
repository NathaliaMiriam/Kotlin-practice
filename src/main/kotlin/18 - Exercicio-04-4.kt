//programa para ser usado na portaria de um evento - resolvido by me
fun main() {
    println("Informe a sua idade: ")
    val resposta = readLine()

    if (resposta != null && resposta != "") {
        val idadeUsuario = resposta.toInt()

        if (idadeUsuario >= 18) {
            println("Idade permitida! Informe o tipo de convite: ")
            var conviteUsuario = readLine()

            if (conviteUsuario == "comum" ||
                conviteUsuario == "premium" ||
                conviteUsuario == "luxo") {
                println("Tipo de convite válido! Informe o código: ")
                var codigoUsuario = readLine()

                if (codigoUsuario != null && codigoUsuario != "") {
                    if (codigoUsuario.startsWith("xl") &&
                        (conviteUsuario == "premium" || conviteUsuario == "luxo")) {
                        println("Welcome :D")
                    } else {
                        if (codigoUsuario.startsWith("xt") && conviteUsuario == "comum") {
                            println("Welcome :D")
                        } else {
                            println("Negado! Convite inválido.")
                        }
                    }
                }

            } else {
                println("Negado! Tipo de convite inválido.")
            }

        } else {
            println("Entrada negada! Menores de idade não são permitidos.")
        }
    }
}
