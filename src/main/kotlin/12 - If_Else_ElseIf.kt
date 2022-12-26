fun main() {
    val num = 30
    if (num > 20) {
        println("Número maior que 20")
    }

    maiorDeIdade(19)
    maiorDeIdade(15)
    maiorDeIdade(61)
    maiorDeIdade(9)
}

fun maiorDeIdade(idade: Int) {
    if (idade > 18) {
        println("Maior de idade")

        if (idade > 60) {
            println("Terceira idade")
        }

    } else if (idade < 10) {
        println("Criança")
    } else {
        println("Menor de idade")
    }
}
