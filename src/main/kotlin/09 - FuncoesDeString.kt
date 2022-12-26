fun main() {
    val str = "Programação Kotlin."

    println("Tamanho da string: ${str.length}")

    println("Posicao/index 0 da string: ${str[0]}")

    println(str.startsWith("Pro"))

    println(str.endsWith("abc"))

    println(str.replace("Kotlin.", "Kotlin é show!!"))

    println(str.lowercase())

    println(str.uppercase())

    println("        Meu nome é               ".trim())
}
