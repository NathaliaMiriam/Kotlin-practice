/*
(+) adição
(-) subtração
(*) multiplicação
(/) divisão
(%) resto --> é o valor que sobra de uma divisão
**/

fun main() {
    var idade = 26

    //idade = idade + 1
    //idade = idade - 1
    //idade = idade * 1
    //idade = idade / 1
    //println(idade)

    //maneira resumida:
    idade += 1
    idade -= 1
    idade *= 1
    idade /= 1

    println(idade)

    //outra maneira de incrementar valor:
    var valor = 30
    println(valor++)
    println(++valor)
    println(valor)

    //outra maneira de decrementar valor:
    var valorr = 50
    println(valorr--)
    println(--valorr)
    println(valorr)

    //resto da divisão com (%):
    var restoDaDivisao = 10 % 3
    println(restoDaDivisao)
}
