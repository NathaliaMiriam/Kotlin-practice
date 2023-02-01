fun main() {

    //lista de inteiros:
    val lst1 = listOf(1, 2, 3, 4, 5)

    //lista 2 de inteiros:
    val lst2: List<Int> = listOf(10, 20, 30, 40, 50)

    //lista com tipos de dados misturados:
    val lst3: List<Any> = listOf(true, false, "string", 10)

    //lista mutável:
    val lst4: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5)


    //trabalhando com a lista mutável:

    println(lst4[0]) //retorna a posição 0

    println(lst4.size) //retorna o tamanho da lista/coleção

    lst4.add(6) //adiciona elementos
    lst4.add(7)

    lst4.remove(2) //remove elementos
    lst4.remove(3)

    lst4.removeAt(0) //remove o elemento que está na posição 0

    println(lst4.contains(5)) //verifica se o elemento contém
    println(lst4.contains(1))

    println(lst4)
}
