class Bicho(var especie: String) {
    var fala: String = ""
        get() {
            println("Acesso get")
            return field
        }

        set(value) {
            println("Acesso set")
            field = value
        }
}
fun main() {
    var b = Bicho("cachorro")
    b.fala = "auuuuuuu"
}
