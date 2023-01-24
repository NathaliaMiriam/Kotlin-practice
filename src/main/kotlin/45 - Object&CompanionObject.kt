class Matematica {

    companion object NOME {
        val PI = 3.1415
        fun teste() {}
        init {
            println("Fui inicializado!")
        }
    }

    object obj1 {
        val PI = 3.1415
        fun teste() {}
        init {
            println("Fui inicializado também!")
        }
    }
    object obj2 {
        val PI = 3.1415
        fun teste() {}
    }

}
fun main() {
    /*Matematica.PI
    Matematica.teste()

    Matematica.obj1.PI
    Matematica.obj2.PI

    val m = Matematica()*/

    Matematica.PI
    Matematica.obj1.PI
}
