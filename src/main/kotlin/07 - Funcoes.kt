fun main() {
    helloWorld()

    val soma = sum(10, 5)
    println(soma)

    //outra maneira de chamar é com o uso da interpolação:
    println("A soma de 10 e 5 é ${sum(a = 10, b = 5)}")
}


fun helloWorld() {
    println("Hello, world!!")
}

fun sum(a: Int, b: Int): Int {
    return (a + b)
}
