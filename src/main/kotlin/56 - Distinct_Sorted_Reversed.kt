fun main() {
     //*distinct*
     println(listOf(1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 8, 8, 8, 8, 9, 10).distinct())


    //*sorted*
    //ordena em ordem crescente
    println(listOf(10, 9, 8, 7, 6, 5, 4, 3, 2, 1).sorted())

    //ordena do maior para o menor
    println(listOf(10, 60, 40, 80, 100).sortedDescending())


    //*reversed*
    println(listOf(1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 8, 8, 8, 8, 9, 10).reversed())
}
