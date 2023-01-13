fun main() {
    //endereco("Magalhaes", "sp", "sp", "02989")
    //endereco(cidade = "sp", rua = "Magalhaes", estado = "sp")

    //println(media(10f, 9.5f))

    //println(media2(10f, 9.5f, "string", 26, true))

    println(media3(false,10f, 9.5f, "string", 26, true))
}

fun endereco(rua: String, cidade: String, estado: String, cep: String = "", num: Int = 0) {

}

fun media(vararg notas: Float): Float {
    var soma = 0f
    for (n in notas) {
        soma += n
    }
    return (soma / notas.size)
}

fun <T> media2(vararg notas: T): Float {
    var soma = 0f
    for (n in notas) {
        if (n is Float) {
            soma += n
        }

    }
    return (soma / notas.size)
}

fun <T, J> media3(abc: J, vararg notas: T): Float {
    var soma = 0f
    for (n in notas) {
        if (n is Float) {
            soma += n
        }

    }
    return (soma / notas.size)
}
