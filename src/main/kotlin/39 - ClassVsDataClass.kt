fun main() {

    //class
    /*val f1: Forma = Forma(10, 8)
    val f2: Forma = Forma(10, 8)

    println(f1.equals(f2))
    println(f1.toString())
    println(f1.hashCode())

    println("------------")

    println(f2.toString())
    println(f2.hashCode())*/


    //data class
    val f1: FormaData = FormaData(10, 8)
    val f2: FormaData = FormaData(10, 8)

    println(f1.equals(f2))
    println(f1.toString())
    println(f1.hashCode())

    println("------------")

    println(f2.toString())
    println(f2.hashCode())

}

//class
class Forma(val a: Int, val b: Int) {
    override fun equals(other: Any?): Boolean {
        return if (other is Forma) {
            (other.a == this.a && other.b == this.b)
        } else {
            false
        }
    }
    override fun toString(): String {
        return "${this.a} + ${this.b}"
    }
    override fun hashCode(): Int {
        return super.hashCode()
    }
}


//data class
data class FormaData(val a: Int, val b: Int) {}
