public class Livro {
    private String nome;
    private String descricao;
    private double valor;
    private String isbn;
    Autor autor;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    void mostrarDetalhes() {
        System.out.println("MOSTRANDO DETALHES DO LIVRO:");
        System.out.println("Nome: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("Valor: R$" + valor);
        System.out.println("ISBN: " + isbn);

        autor.mostrarDetalhes();
        
        System.out.println("--");
    }

    public boolean aplicaDescontoDe(double porcentagem){
        if (porcentagem > 0.3) {
            return false;
        }
        this.valor -= this.valor * porcentagem;
        return true;
    }
}
