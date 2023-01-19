class Animal(var especie: String) {

    var fala: String = ""
    init {
       if (especie == "cachorro") {
           fala = "au au"
       } else if (especie == "gato") {
           fala = "miau"
       } else {
           fala = "não identificado"
       }
    }
    fun falar() {
        println(fala)
    }
}

fun main() {
    Animal("gato").falar()
}
