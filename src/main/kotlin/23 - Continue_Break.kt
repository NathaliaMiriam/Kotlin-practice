fun main() {
    /*var i = 0

    while (i < 100000000) {

        if (i == 50){
            break
        }

        print("$i ")
        i++
    }*/

    var i = 0

    while (i < 80) {

        if (i < 50) {
            i++
            continue
        }

        print("$i ")
        i++
    }
}
