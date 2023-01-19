// ex. 1
enum class Prioridade {
    Baixa, Media, Alta
}
enum class AnimalEnum {
    Cachorro, Gato, Cavalo, Vaca
}
fun x(p: Prioridade) {

}

// ex. 2
enum class Prioridade2(val value: Int) {
    Baixa(1) {
        override fun toString(): String {
            return "Prioridade baixa: $value"
        }
             },
    Media(5),
    Alta(15)
}

fun main() {
    // 1
    x(Prioridade.Baixa)

    // 2
    for (p in Prioridade2.values()) {
        println(p)
    }
}
