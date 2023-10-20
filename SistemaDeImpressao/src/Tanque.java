public enum Tanque {
    CIANO("Colorido", 100),
    MAGENTA("Colorido", 100),
    AMARELO("Colorido", 100),
    PRETO("Normal", 100);

    private final String descricao;
    private double tintaRestante;

    Tanque(String descricao, double tintaRestante) {
        this.descricao = descricao;
    }

    public double getTintaRestante() {
        return tintaRestante;
    }

    public String getDescricao() {
        return descricao;
    }
}