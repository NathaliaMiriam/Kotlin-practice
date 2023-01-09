import java.lang.NullPointerException

fun main() {
    //ex. 1
    try {
        val s: String? = null
        println(s!!.length)
    } catch (e: NullPointerException) {
        println("Variável nula!!")
    }

    println("Fim")


    //ex. 2
    try {
        val s: String? = null
        println(s!!.length)
        val a = 10 / 0
    } catch (e: NullPointerException) {
        println("Variável nula!!")
    } catch (e: ArithmeticException) {
        println("Impossível dividir por zero!!")
    }

    println("Fim")

}
