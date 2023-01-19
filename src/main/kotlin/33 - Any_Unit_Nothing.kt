fun main() {
    //Any
    valores(1)
    valores("")
    valores(true)

    valores2(1)
    valores2("")
    valores2(true)

}

fun valores(value: Any) {

}
fun <T> valores2(value: T) {

}

fun valores3(value: Any): Unit {

}

fun valores4(value: Any): Nothing {
    TODO("Não implementado")
}
