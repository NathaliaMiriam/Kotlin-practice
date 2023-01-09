fun main() {
    val str: String? = null

    //controle de fluxo normal:
    if (str == null) {
        println("Nulo")
    } else {
        println(str)
    }

    //mesma coisa, só que, com o elvis operator:
    println(str ?: "Nulo")
}
