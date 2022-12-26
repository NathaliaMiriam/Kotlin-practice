//1
fun converteAnos(anos: Int) {
    println("$anos anos equivalem a: ")
    println("${anos * 12} meses")
    println("${anos * 365} dias")
    println("${anos * 365 * 24} horas")
    println("${anos * 365 * 24 * 60} minutos")
    println("${anos * 365 * 24 * 60 * 60} segundos")
}

//2
//maneira extendida:
/*fun caracteres(str: String): Int {
    return str.length
}*/

//maneira resumida:
fun caracteres(str: String) = str.length


//3
//maneira extendida:
/*fun cubo(n: Int): Int {
    return n * n * n
}*/

//maneira resumida:
fun cubo(n: Int) = n * n * n


//4
//maneira extendida:
/*fun milhasKm(milhas: Float): Float {
    return milhas * 1.6f
}*/

//maneira resumida:
fun milhasKm(milhas: Float): Float = milhas * 1.6f


//5
fun troca(str: String) {
    //primeira maneira de fazer:
    //println(str.replace("A", "x").replace("a", "x").lowercase())

    //segunda maneira de fazer:
    //println(str.lowercase().replace("a", "x"))

    //terceira maneira de fazer:
    println(str.replace("a", "x", true).lowercase())
}


fun main() {
    converteAnos(2)

    println(caracteres("Retornar a quantidade de caracteres"))

    println(cubo(3))

    println( milhasKm(100f))

    println(troca("AaAaAaAa nnn kkk xxxx XXX nananaAAnnaa."))
}
