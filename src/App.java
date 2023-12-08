public class App {
    public static void main(String[] args) throws Exception {
        System.out.println();

        Autor autor = new Autor();
        autor.nome = "Fiódor Dostoiévski";
        autor.email = "nao-possui@exemplo.com";
        autor.cpf = "123.456.789-99";
 
        Livro livro = new Livro();
        livro.setNome("Crime e Castigo");
        livro.setDescricao("3 irmãos e um pai devasso");
        livro.setValor(79.90);
        livro.setIsbn("789-58-55260-46-9");
        livro.autor = autor;
        livro.mostrarDetalhes();
        
        System.out.println();

        Autor autor2 = new Autor();
        autor2.nome = "Rodrigo Turini";
        autor2.email = "rodrig.nome@exemplo.com";
        autor2.cpf = "123.456.789-99";

        Livro livro2 = new Livro();
        livro2.setNome("Java 8 Na Prática");
        livro2.setDescricao("Aprendendo a lidar com Java e a programação orientada a objetos.");
        livro2.setValor(59.90);
        livro2.setIsbn("458-58-12477-46-9");
        livro2.autor = autor2;
        livro2.mostrarDetalhes();
    }
}
