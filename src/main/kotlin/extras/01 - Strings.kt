package extras
fun main() {

    /* 1
    println(verifyPonctuation("Hello, world."))
    println(verifyPonctuation("Hello, world")) */


    /* 2
    println("Digite seu nome: ")
    var name = readln()

    println("Digite seu sobrenome: ")
    var lastName = readln()

    println(verifyNameAndLastName(name, lastName)) */


    /* 3
    println("Digite uma palavra: ")
    var palavra1 = readln()

    println("Digite outra palavra: ")
    var palavra2 = readln()

    println(verifyWordsSize(palavra1, palavra2)) */

}

// 1 — função que verifica se a frase termina com o ponto final
fun verifyPonctuation(phrase: String): Boolean {

    if (phrase.endsWith(".")) {
        return true
    } else {
        return false
    }
}

// 2 — função que recebe nome e sobrenome e devolve as iniciais
fun verifyNameAndLastName(name: String, lastName: String): String {

    return "${name[0]} | ${lastName[0]}"
}

// 3 — função que recebe 2 palavras e retorna a mais longa, caso sejam do mesmo tamanho, printar: "são do mesmo tamamanho"
fun verifyWordsSize(word1: String, word2: String): String {

    var word1Size = word1.length
    var word2Size = word2.length

    if (word1Size > word2Size) {
        return word1
    } else if (word1Size < word2Size) {
        return word2
    } else {
        return "São do mesmo tamanho"
    }
}
