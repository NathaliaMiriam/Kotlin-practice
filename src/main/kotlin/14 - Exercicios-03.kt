fun main() {
    // 1
    val bonus = bonus("Gerente")
    println(bonus)

    // 2
    val bonus2 = bonus2("Gerente", experiencia = 3)
    println(bonus2)

    // 3
    val a = false
    val b = false
    val c = true
    val d = true

    println(a && b && c && d)
    //false + true = false ... Para o resultado ser true, todas as expressões teriam que ser true

    println(!a && !b && (c && d))
    //true + true e true + true = true

    println(a && ((b || c) || d))
    //com o '&&' todas as expressões precisam ser true para o resultado ser true, então, esta é = false

    println(a || ((!b && c) || !d))
    //com o '||' apenas uma expressão precisa ser true para o resultado ser true, então, esta é = true
}

// 1
fun bonus(cargo: String): Float {

    var bonus = 0f

    if (cargo == "Gerente") {
        bonus = 2000f
    }
    else if (cargo == "Coordenador") {
        bonus = 1500f
    }
    else if (cargo == "Engenheiro de Software") {
        bonus = 1000f
    }
    else if (cargo == "Estagiario") {
        bonus = 500f
    }

    return bonus
}

// 2
fun bonus2(cargo: String, experiencia: Int): Float {

    var bonus2 = 0f

    if (cargo == "Gerente") {
        if (experiencia < 2) {
            bonus2 = 2000f
        } else {
            bonus2 = 3000f
        }
    } else if (cargo == "Coordenador") {
        if (experiencia < 1) {
            bonus2 = 1500f
        } else {
            bonus2 = 1800f
        }
    } else if (cargo == "Engenheiro de Software") {
        bonus2 = 1000f
    } else if (cargo == "Estagiario") {
        bonus2 = 500f
    }
    return bonus2
}
