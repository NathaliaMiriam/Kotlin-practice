fun main() {

    //1
    for (i in 1..50) {
        //print("$i ")
    }

    //2
    for (i in 50 downTo 1) {
        //print("$i ")
    }

    //3
    for (i in 1..50) {

        if (i % 5 != 0) {
            //print("$i ")
        }
    }

    //4
    var soma = 0

    for (i in 1..500) {
        soma += i
    }
    //print(soma)

}
