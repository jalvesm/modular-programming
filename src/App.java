public class App {
    public static void main(String[] args) throws Exception {
        System.out.println();

        Autor autor = new Autor();
        autor.nome = "Fiódor Dostoiévski";
        autor.email = "nao-possui@exemplo.com";
        autor.cpf = "123.456.789-99";

        Livro livro = new Livro();
        livro.nome = "Crime e Castigo";
        livro.descricao = "3 irmãos e um pai devasso";
        livro.valor = 79.90;
        livro.isbn = "789-58-55260-46-9";
        livro.autor = autor;
        livro.mostrarDetalhes();

        System.out.println();
        System.out.println("Valor atual: R$" + livro.valor);
        
        if (!livro.aplicaDescontoDe(0.1)) {
            System.out.println("Desconto não pode ser maior do que 30%!");
        } else {
            System.out.println("Valor com desconto: R$" + livro.valor);
        }

        System.out.println();
        System.out.println();
        System.out.println();

        Autor autor2 = new Autor();
        autor2.nome = "Rodrigo Turini";
        autor2.email = "rodrig.nome@exemplo.com";
        autor2.cpf = "123.456.789-99";

        Livro livro2 = new Livro();
        livro2.nome = "Java 8 Prático";
        livro2.descricao = "Novos recursos da linguagem";
        livro2.valor = 59.90;
        livro2.isbn = "978-85-66250-46-6";
        livro2.autor = autor2;
        livro2.mostrarDetalhes();
    }
}
