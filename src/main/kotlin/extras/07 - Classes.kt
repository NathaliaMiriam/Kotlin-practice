package extras
//classe de estoque de produto e qtd e funções de compra(adiciona na qtd do pdt) e venda(subtrai na qtd do pdt)

data class ProdutoSupermercado(
    var produto: String,
    var marca: String,
    var preco: Float,
    var quantidade: Int
) {
    fun compraDeProduto(produtoComprado: Int) {
        quantidade += produtoComprado
    }

    fun vendaDeProduto(produtoVendido: Int) {
        quantidade -= produtoVendido
    }

    override fun toString(): String {
        return "Produto: ${this.produto} | Marca: ${this.marca} | Preço: ${this.preco} | " +
                "Quantidade Atual: ${this.quantidade}"
    }
}
fun main() {
    var controleDeEstoque : ProdutoSupermercado = ProdutoSupermercado(
        "Leite",
        "Italac",
        5.60f,
        50
    )

    println(controleDeEstoque.toString())

    controleDeEstoque.compraDeProduto(10)
    println(controleDeEstoque.toString())

    controleDeEstoque.vendaDeProduto(20)
    println(controleDeEstoque.toString())
}
