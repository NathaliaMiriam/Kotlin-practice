// { parâmetros -> corpo }

fun abc(x: Int) {}
fun main() {

    /*val a = {
        println("execução que não tem retorno")
        println("execução que não tem retorno 2")
    }
    receiveA(a)

    val b = { x: Int -> x * x }
    receiveB(b)

    val c = { x: Int, y: Int ->
        println("Lambda c")
        x * y
    }
    receiveC(c)*/

    receiveA {
        println("execução que não tem retorno")
        println("execução que não tem retorno 2")
    }

    receiveB { x: Int -> x * x }

    receiveC { x: Int, y: Int ->
        println("Lambda c")
        x * y}
}


fun receiveA(lambda: () -> Unit) {
    lambda()
}
fun receiveB(tt: (x: Int) -> Int) {}

fun receiveC(lamb: (b1: Int, b2: Int) -> Int) {}
