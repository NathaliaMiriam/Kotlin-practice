fun main() {
    //quadrado()

    //triangulo()

    //qualASaida(4)
}

// 1
fun quadrado() {
    println("Informe o lado 1 : ")
    val lado1 = readLine()

    println("Informe o lado 2: ")
    val lado2 = readLine()

    if (lado1 != null && lado1 != "" && lado2 != null && lado2 != "") {
        val x = lado1.toInt()
        val y = lado2.toInt()

        if (x == y) {
            println("É um quadrado")
        } else {
            println("Não é um quadrado")
        }
    }
}

// 2
fun triangulo() {
    println("Informe o lado 1: ")
    val lado1 = readLine()

    println("Informe o lado 2: ")
    val lado2 = readLine()

    println("Informe o lado 3: ")
    val lado3 = readLine()

    if (lado1 != null && lado1 != ""
        && lado2 != null && lado2 != ""
        && lado3 != null && lado3 != "") {
        val x = lado1.toInt()
        val y = lado2.toInt()
        val z = lado3.toInt()

        if (x == y && x == z) {
            println("É um triangulo equilatero")
        } else {
            println("Não é um triangulo equilatero")
        }
    }
}

// 3
fun qualASaida(num: Int) {
    if (4 >= 0) {
        if (4 == 0)
            println("Primeira string")
        else println("Segunda string")
    }
    println("Terceira string")
}
