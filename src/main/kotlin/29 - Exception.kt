import java.lang.NullPointerException

fun main() {
    try {
        val s: String? = null
        println(s!!.length)
    }  catch (e: Exception) {
        println("Exceção genérica!!")
    } catch (e: NullPointerException) {
        println("Variável nula!!")
    } catch (e: ArithmeticException) {
        println("Impossível dividir por zero!!")
    }

    println("Fim")
}
