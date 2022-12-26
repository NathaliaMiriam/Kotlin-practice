/**
Bit – está relacionado com o tamanho que uma variável consegue guardar na memória e isso depende do tipo da variável. Ou seja, quanto mais Bits, maior a capacidade de armazenamento.

Double - armazena número inteiro, mas foi criado para valores com ponto flutuante. Ex: 1.5, 1.003.
Float - armazena número inteiro, mas foi criado para valores com ponto flutuante. Ex: 1.5, 1.003.

Long – armazena número inteiro.
Int - armazena número inteiro.
Short - armazena número inteiro.
Byte - armazena número inteiro.

Boolean – é para true ou false.

String – é para textos e utiliza aspas duplas.

Char – é para somente 1 caractere e utiliza aspas simples. Ex. ‘a’.


Unsigned - são tipos de dados sem sinal, ou seja, não possui valor negativo, somente valor positivo.

 **/

//tamanho máximo que os tipos numéricos conseguem armazenar
fun main() {
    println("Double MAX ${Double.MAX_VALUE} - MIN ${Double.MIN_VALUE}")
    println("Float MAX ${Float.MAX_VALUE} - MIN ${Float.MIN_VALUE}")
    println("Long MAX ${Long.MAX_VALUE} - MIN ${Long.MIN_VALUE}")
    println("Int MAX ${Int.MAX_VALUE} - MIN ${Int.MIN_VALUE}")
    println("Short MAX ${Short.MAX_VALUE} - MIN ${Short.MIN_VALUE}")
    println("Byte MAX ${Byte.MAX_VALUE} - MIN ${Byte.MIN_VALUE}")
}
