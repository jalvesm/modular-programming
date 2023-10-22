public class ModoNormal implements IModoImpressao {
    private static final double CUSTO_NORMAL = 0.10;

    @Override
    public String getNome(){
        return "normal";
    }

    @Override
    public double calcularPreco(int quantidadePaginas) {
        return quantidadePaginas * CUSTO_NORMAL;
    }
}


// os métodos que aplicam a interface
// eles têm de me dizer QUEM ELES SÃO!
// Não importa pro método imprimir() da classe impressão, se é colorido ou normal. Desde que esses métodos "aplicadores" saibam qual é a natureza deles e, por consequência, quais são a(s) sua(s) respectiva(s) regras(s).

// ISSO É POLIMORFISMO!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

