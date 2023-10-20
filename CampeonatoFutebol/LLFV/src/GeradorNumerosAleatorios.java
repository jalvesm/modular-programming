import java.util.Random;

public class GeradorNumerosAleatorios {
    public static void main(String[] args) {
        int numeroAleatorio = gerarNumeroAleatorio(0, 4);
        System.out.println(numeroAleatorio);
    }

    public static int gerarNumeroAleatorio(int minimo, int maximo) {
        Random gerador = new Random();
        int numeroAleatorio = gerador.nextInt(maximo - minimo + 1) + minimo;
        return numeroAleatorio;
    }
}
