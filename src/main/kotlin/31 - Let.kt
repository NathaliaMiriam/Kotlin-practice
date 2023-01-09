fun main() {
    val str: String? = null

    //controle de fluxo normal:
    if (str != null) {
        str.lowercase()
    }

    //mesma coisa, só que, com o let:
    str?.let {
        it.lowercase()
    }
}
