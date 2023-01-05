//programa para ser usado na portaria de um evento - resolvido by teacher
fun main() {
    portaria()
}
fun portaria() {
    println("Qual a sua idade? ")
    val idade = readLine()

    if (idade != null && idade != "") {
        if (idade.toInt() < 18) {
            println("Negado! Menores de idade não são permitidos.")
            return
        }
    }

    println("Qual o tipo do seu convite? ")
    var tipoConvite = readLine()

    if (tipoConvite != null && tipoConvite != "") {
        tipoConvite = tipoConvite.lowercase()

        if (tipoConvite != "comum" && tipoConvite != "premium" && tipoConvite != "luxo") {
            println("Negado! Convite inválido.")
            return
        }

            println("Qual o código do seu convite? ")
            var codigoConvite = readLine()

            if (codigoConvite != null && codigoConvite != "") {
                codigoConvite = codigoConvite.lowercase()

                if (tipoConvite == "comum" && codigoConvite.startsWith("xt")) {
                    println("Welcome!!!")
                } else if (tipoConvite == "premium" || tipoConvite == "luxo" && codigoConvite.startsWith("xl")) {
                    println("Welcome!!!")
                } else {
                    println("Negado! Convite inválido.")
                }
            }
        }
    }
