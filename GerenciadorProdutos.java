public class GerenciadorProdutos {
    private Produto[] produtos;
    private int contador;

    public GerenciadorProdutos(int capacidade) {
        this.produtos = new Produto[capacidade];
        this.contador = 0;
    }

    public void adicionarProduto(Produto produto) {
        if (contador < produtos.length) {
            produtos[contador++] = produto;
        } else {
            System.out.println("Capacidade máxima atingida. Não é possível adicionar mais produtos.");
        }
    }

    public void listarProdutos() {
        for (int i = 0; i < contador; i++) {
            System.out.println(produtos[i]);
        }
    }

    public Produto buscarProduto(String nome) {
        for (int i = 0; i < contador; i++) {
            {
                return produtos[i];
            }
        }
        return null;
    }

    public void atualizarEstoque(String nome, int quantidade) {
        Produto produto = buscarProduto(nome);
        if (produto != null) {
            produto.setQtdEstoque(produto.getQtdEstoque() + quantidade);
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

    public void removerProduto(String nome) {
        for (int i = 0; i < contador; i++) {
                produtos[i] = produtos[--contador];
                produtos[contador] = null;
                return;

        }
        System.out.println("Produto não encontrado.");
    }
}
