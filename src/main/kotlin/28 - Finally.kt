import java.lang.NullPointerException

fun main() {
    try {
        val s: String? = null
        println(s!!.length)
        val a = 10/0
    } catch (e: NullPointerException) {
        println("Variável nula!!")
    } catch (e: ArithmeticException) {
        println("Impossível dividir por zero!!")
    } finally {
        println("Finally!!")
    }

    println("Fim")
}
