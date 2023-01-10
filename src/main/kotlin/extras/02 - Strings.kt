package extras

fun main() {
    //1
    /*
    println("Digite uma frase: ")
    var fraseRecebida = readln()

    var frasePontuada = verificaEColocaPontoFinal(fraseRecebida)
    println(frasePontuada)*/


    //2
    println("Digite uma frase: ")
    var fraseRecebida = readln()

    println("Digite um caractere: ")
    var caractereRecebido = readln().toCharArray().first()

    var quantidadeDoCaractere = contaCaractere(fraseRecebida, caractereRecebido)
    println("A sua frase possui $quantidadeDoCaractere do caractere $caractereRecebido.")


    //3
    println("Digite uma palavra: ")
    var palavraUm = readln()

    println("Digite outra palavra: ")
    var palavraDois = readln()

    var quantidadeLetras = somaLetras(palavraUm, palavraDois)
    println("A soma de letras da palavra $palavraUm com a palavra $palavraDois é $quantidadeLetras.")


    //4
    println("Digite uma frase: ")
    var fraseEscrita = readln()

    var verificacaoDaFrase = verificaTipoDeFrase(fraseEscrita)
    println(verificacaoDaFrase)
}


/* 1- função que verifica se a frase tem ponto final, caso não tenha, colocar e devolver a frase, caso já tenha,
só devolver a frase. */
fun verificaEColocaPontoFinal(frase: String): String {
    var ultimoCaractere = frase.last()

    if (ultimoCaractere == '.') {
        return frase
    } else {
        return "${frase}."
    }
}


/* 2- função que recebe uma frase e um caractere, ela devolve a qtd(Int) de vezes que o caractere recebido aparece
na frase recebida. */
fun contaCaractere(frase: String, caractere: Char): Int {

    var contador = 0

    for (letra in frase) {
        if (letra == caractere) {
            contador++
        } else {
            continue
        }
    }

    return contador
}


// 3- função que recebe 2 palavras e devolve a soma de letras de cada uma.
fun somaLetras(palavraUm: String, palavraDois: String): Int {

    var soma = palavraUm.length + palavraDois.length
    return soma
}


// 4- função que verifica se a frase recebida é uma pergunta(?), caso seja, retornar true, senão, retornar false.
fun verificaTipoDeFrase(frase: String): Boolean {

    if (frase.endsWith('?')) {
        return true
    } else {
        return false
    }
}
