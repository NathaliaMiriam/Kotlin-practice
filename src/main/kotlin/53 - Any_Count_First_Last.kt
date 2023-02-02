fun main() {
    val data = geraDados()

    //any
    //println("Tenho dados? ${if (data.any()) "sim" else "não"}")

    //count
    //println("Tenho ${data.count()} elementos")

    //first
    println("Primeira receita: ${data.first().nome}")

    //last
    println("Última receita: ${data.last().nome}")

    //para tratar um nulo
    println(listOf<Int>().firstOrNull())
    println(listOf<Int>().lastOrNull())

}
fun geraDados(): List<ReceitaCulinaria> {
    return listOf(
        ReceitaCulinaria(
            "Lasanha", 1200,
            listOf(
                Ingrediente("Presunto", 5),
                Ingrediente("Queijo", 10),
                Ingrediente("Molho de tomate", 2),
                Ingrediente("Manjerição", 3)
            )
        ),
        ReceitaCulinaria("Panqueca", 500),
        ReceitaCulinaria("Omelete", 200),
        ReceitaCulinaria("Parmegiana", 700),
        ReceitaCulinaria("Sopa de feijão", 300),
        ReceitaCulinaria(
            "Hamburguer", 2000,
            listOf(
                Ingrediente("Pão", 1),
                Ingrediente("Hamburguer", 3),
                Ingrediente("Queijo", 1),
                Ingrediente("Catupiry", 1),
                Ingrediente("Bacon", 3),
                Ingrediente("Alface", 1),
                Ingrediente("Tomate", 1)
            )
        )
    )
}

data class ReceitaCulinaria(val nome: String, val calorias: Int, val ingredientes: List<Ingrediente> = listOf())
data class Ingrediente(val nome: String, val quantidade: Int)
