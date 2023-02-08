fun main() {

    val data2 = geraDados2()

    //*sum*
    println(listOf<Double>(1.5, 6.5).sum())

    //*sumOf - somando as calorias*
    println(data2.sumOf { it.calorias })


    //*filter*

    //filtrar se existe algum elemento na lista cujo nome é Lasanha
    println(data2.filter { it.nome == "Lasanha" }) //me retorna a Lasanha, pois tem na lista

    //filtrar as calorias maiores que 500
    println(data2.filter { it.calorias > 500 }) //me retorna a Lasanha, a Parmegiana e o Hamburguer


    //filtar se existe alguma receita que tem mais que 500 calorias ... sem o predicado
    println(data2.filter { it.calorias > 500 }.any())

    //filtar se existe alguma receita que tem mais que 500 calorias ... com o predicado
    data2.any { it.calorias > 500 }


    //filtar quantas receitas tem mais que 500 calorias ... com o predicado
    data2.count { it.calorias > 500 }


    //*take e takelast*
    println(data2.take(2)) //retorna as 2 primeiras receitas
    println(data2.takeLast(2)) //retorna as 2 últimas receitas


}
fun geraDados2(): List<ReceitaCulinaria2> {
    return listOf(
        ReceitaCulinaria2(
            "Lasanha", 1200,
            listOf(
                Ingredientes("Presunto", 5),
                Ingredientes("Queijo", 10),
                Ingredientes("Molho de tomate", 2),
                Ingredientes("Manjerição", 3)
            )
        ),
        ReceitaCulinaria2("Panqueca", 500),
        ReceitaCulinaria2("Omelete", 200),
        ReceitaCulinaria2("Parmegiana", 700),
        ReceitaCulinaria2("Sopa de feijão", 300),
        ReceitaCulinaria2(
            "Hamburguer", 2000,
            listOf(
                Ingredientes("Pão", 1),
                Ingredientes("Hamburguer", 3),
                Ingredientes("Queijo", 1),
                Ingredientes("Catupiry", 1),
                Ingredientes("Bacon", 3),
                Ingredientes("Alface", 1),
                Ingredientes("Tomate", 1)
            )
        )
    )
}

data class ReceitaCulinaria2(val nome: String, val calorias: Int, val ingredientes: List<Ingredientes> = listOf())
data class Ingredientes(val nome: String, val quantidade: Int)
