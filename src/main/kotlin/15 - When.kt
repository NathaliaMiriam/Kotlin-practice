//utilizando o exercicio anterior
fun main() {
    val bonus = bonusWhen("Coordenador")
    //println(bonus)

    val bonus2 = bonusWhen2("Estagiario")
    //println(bonus2)


    //operador de intervalo (range) com when - utilizando valor
    val n = 80
    when (n) {
        in 1..10 -> println("1..10")
        in 10..100 -> println("10..100")
    }

    //operador de intervalo (range) com when - utilizando boolean
    val n2 = true
    when (n2) {
        true -> println("1..10")
        false -> println("10..100")
    }
}

//primeira maneira de utilizar o when
fun bonusWhen(cargo: String): Float {
    var bonus = 0f
    when (cargo) {
        "Gerente" -> bonus = 2000f
        "Coordenador" -> bonus = 1500f
        "Engenheiro de Software" -> bonus = 1000f
        "Estagiario" -> bonus = 500f
    }

    return bonus
}

// segunda maneira de utilizar o when
fun bonusWhen2(cargo: String): Float {
    return when (cargo) {
        "Gerente" -> 2000f
        "Coordenador" -> 1500f
        "Engenheiro de Software" -> 1000f
        "Estagiario" -> 500f
        else -> 0f
    }
}
