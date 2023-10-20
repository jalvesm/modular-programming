import java.util.ArrayList;
import java.util.List;

public class Pagina {
    private int numero;
    private List<String> conteudos;

    public Pagina(int numero) {
        this.numero = numero;
        this.conteudos = new ArrayList<>();
    }

    public void addConteudo(String texto) {
        conteudos.add(texto);
    }

    public List<String> getConteudos() {
        return conteudos;
    }

    public int getNumeroDaPagina() {
        return this.numero;
    }
}