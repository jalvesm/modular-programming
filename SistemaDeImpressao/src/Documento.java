import java.util.ArrayList;
import java.util.List;

public class Documento {
    private String nome;
    private List<Pagina> paginas;

    public Documento(String nome) {
        this.nome = nome;
        this.paginas = new ArrayList<>();
    }

    public String getNome(){
        return nome;
    }

    public void adicionaPagina(Pagina numDePginas) {
        paginas.add(numDePginas);
    }

    public int quantPaginas() {
        return paginas.size();
    }
}
