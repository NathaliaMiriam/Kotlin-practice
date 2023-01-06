fun main() {

    //1
    var litrosNaCaixa = 0
    var contador = 0

    while (litrosNaCaixa < 2000) {
        litrosNaCaixa += 7
        contador++
    }
    //print(contador - 1)

    //2
    /*var i = 1

    while (i < 51) {

        if (i % 3 == 0 && i % 5 == 0) {
            print("FizzBuzz ")
            i++
        } else if (i % 3 == 0){
            print("Buzz ")
            i++
        } else if (i % 5 == 0) {
            print("Fizz ")
            i++
        } else {
            print("$i ")
            i++
        }
    }*/

    //3
    /*println("Insira uma frase: ")
    var phrase = readLine()

    var phraseReverted = phrase!!.reversed()
    println(phraseReverted)*/

    //4
    println(verifyXO("xxooox"))
    println(verifyXO("xxxxo"))
    println(verifyXO("bdefghjij"))
    println(verifyXO("oooo/zzzz"))

}

fun verifyXO(word: String): Boolean {

    var contadorX = 0
    var contadorO = 0

    for (char in word) {

        if (char == 'x') {
            contadorX++
        } else if (char == 'o') {
            contadorO++
        } else {
            continue
        }
    }

    if (contadorX == 0 && contadorO == 0) {
        return false
    } else if (contadorX != contadorO) {
        return false
    } else {
        return true
    }
}
