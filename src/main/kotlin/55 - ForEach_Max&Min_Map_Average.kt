fun main() {

    val data3 = geraDados3()

    //*forEach*

    //retorna o nome das receitas
    data3.forEach { println(it.nome) }

    //retorna quais são as receitas que possuem mais que 500 calorias - juntando 2 funções
    data3.filter { it.calorias > 500 }.forEach { println(it.nome) }


    //*max e min*

    //retorna a receita que tem mais calorias - apenas valor
    println(data3.maxOf { it.calorias })

    //retorna a receita que tem mais calorias - objeto inteiro ... com todas suas infos
    println(data3.maxByOrNull { it.calorias })

    //retorna a receita que tem menos calorias - apenas valor
    println(data3.minOf { it.calorias })

    //retorna a receita que tem menos calorias - objeto inteiro ... com todas suas infos
    println(data3.minByOrNull { it.calorias })

    //retorna o valor máximo desta coleção - que é o valor 5
    println(listOf(1, 3, 5).maxOf { it })

    //retorna o valor minimo desta coleção - que é o valor 2
    println(listOf(2, 4, 6).minOf { it })


    //*map*
    println(data3.map { it.calorias })

    //*filter*
    println(data3.filter { it.calorias > 500})


    //*average*

    //retorna a média entre os 3 números 1 + 2 + 3 / 3 = 2
    println(listOf(1, 2, 3).average())

    //retorna a média das calorias das receitas do conjunto
    println(data3.map { it.calorias }.average())
}
fun geraDados3(): List<ReceitaCulinaria3> {
    return listOf(
        ReceitaCulinaria3(
            "Lasanha", 1200,
            listOf(
                Ingredients("Presunto", 5),
                Ingredients("Queijo", 10),
                Ingredients("Molho de tomate", 2),
                Ingredients("Manjerição", 3)
            )
        ),
        ReceitaCulinaria3("Panqueca", 500),
        ReceitaCulinaria3("Omelete", 200),
        ReceitaCulinaria3("Parmegiana", 700),
        ReceitaCulinaria3("Sopa de feijão", 300),
        ReceitaCulinaria3(
            "Hamburguer", 2000,
            listOf(
                Ingredients("Pão", 1),
                Ingredients("Hamburguer", 3),
                Ingredients("Queijo", 1),
                Ingredients("Catupiry", 1),
                Ingredients("Bacon", 3),
                Ingredients("Alface", 1),
                Ingredients("Tomate", 1)
            )
        )
    )
}

data class ReceitaCulinaria3(val nome: String, val calorias: Int, val ingredientes: List<Ingredients> = listOf())
data class Ingredients(val nome: String, val quantidade: Int)
