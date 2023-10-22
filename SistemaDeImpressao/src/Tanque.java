public enum Tanque {
    CIANO(21),
    MAGENTA(21),
    AMARELO(12),
    PRETO(12);

    double tintaRestante;

    Tanque(double tintaRestante) {
        this.tintaRestante = tintaRestante;
    }

    public double getTintaRestante() {
        return tintaRestante;
    }

    public static void imprimirEstimativaDeTintaRestante() {
        System.out.println("Estimativa do volume de tinta: ");
        for (Tanque tanque : values()) {
            System.out.println(tanque + ": " + tanque.getTintaRestante());
        }
    }
}   