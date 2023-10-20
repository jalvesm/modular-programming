import java.util.List;

public class Impressao {
    protected List<Documento> documentos;
    private ModoImpressao modoImpressao;
    private static final double CAPACIDADE = 100;

    public Impressao(ModoImpressao modoImpressao) {
        this.modoImpressao = modoImpressao;
    }

    public void acidionaDocumento(Documento novoDocumento) {
        documentos.add(novoDocumento);
    }

    public boolean tintaNaReserva(Tanque tanque) {
        double restante = tanque.getTintaRestante();
        return restante / CAPACIDADE <= 0.1;
    }

    public double imprimir(Documento documento) {
        double precoTotal = modoImpressao.calcularPreco(documento.quantPaginas());
        return precoTotal;
    }
}
