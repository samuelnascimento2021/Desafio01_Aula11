public class Principal {
    public static void main(String[] args) {
        GerenciadorProdutos gerenciador = new GerenciadorProdutos(10); // capacidade para 10 produtos

        Produto p1 = new Produto("Smartphone", 2595.99, 10);
        Produto p2 = new Produto("Smart TV", 3444.99, 25);
        Produto p3 = new Produto("AirFrier", 1400.00, 20);

        gerenciador.adicionarProduto(p1);
        gerenciador.adicionarProduto(p2);
        gerenciador.adicionarProduto(p3);

        System.out.println("Listando produtos:");
        gerenciador.listarProdutos();

        System.out.println("\nBuscando produto:");
        Produto produtoBuscado = gerenciador.buscarProduto("Smart TV");
        if (produtoBuscado != null) {
            System.out.println(produtoBuscado);
        } else {
            System.out.println("Produto não encontrado!");
        }

        System.out.println("\nAtualizando estoque: ");
        gerenciador.atualizarEstoque("Smartphone", 30);
        gerenciador.listarProdutos();

        System.out.println("\nRemovendo produto: ");
        gerenciador.removerProduto("AirFrier");
        gerenciador.listarProdutos();
    }
}
