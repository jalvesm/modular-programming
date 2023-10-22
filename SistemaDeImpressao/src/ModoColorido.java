public class ModoColorido implements IModoImpressao {
    private static final double CUSTO_COLORIDA = 0.50;

    @Override
    public String getNome(){
        return "colorido";
    }

    @Override
    public double calcularPreco(int quantidadePaginas) {
        return quantidadePaginas * CUSTO_COLORIDA;
    }
}