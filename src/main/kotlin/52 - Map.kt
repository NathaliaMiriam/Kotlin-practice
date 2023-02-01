fun main() {

    val map1 = mapOf<String, String>(Pair("França", "Paris"), Pair("Alemanha", "Berlim"))

    val map2 = mutableMapOf<String, String>(Pair("França", "Paris"), Pair("Alemanha", "Berlim"))

    println(map1)

    println(map1.entries) //retorna todas as entradas/chaves
    println(map1.values) //retorna todos os valores associados às chaves

    map2["Brasil"] = "Brasilia" //add novos valores
    println(map2)
}
