import java.util.List;

public class Impressao {
    protected List<Documento> documentos;
    private IModoImpressao modoImpressao;

    public Impressao(IModoImpressao modoImpressao) {
        this.modoImpressao = modoImpressao;
    }

    public void acidionaDocumento(Documento novoDocumento) {
        documentos.add(novoDocumento);
    }

    public double imprimir(Documento documento) {
        double precoTotal = modoImpressao.calcularPreco(documento.quantPaginas());
        return precoTotal;
    }
}
