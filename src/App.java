public class App {
    public static void main(String[] args) throws Exception {
        
        Autor autor = new Autor();
        autor.setNome("Fiodor Dostoiévski");

        LivroFisico fisico = new LivroFisico(autor);
        fisico.setNome("Crime e Castigo");
        fisico.setValor(59.90);

        Ebook ebook = new Ebook(autor);
        ebook.setNome("Os Irmãos Karamazov");
        ebook.setValor(29.90);

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adiciona(fisico);
        carrinho.adiciona(ebook);

        System.out.println("TOTAL: R$" + carrinho.getTotal());

    }
}
