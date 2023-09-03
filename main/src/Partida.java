import java.util.Scanner;

class Partida {
    static String[] quartoVigente = {"Q1", "Q2", "Q3", "Q4"};
    static int[] equipeA = new int[4];
    static int[] equipeB = new int[4];
    static Scanner scanner = new Scanner(System.in);

    public static int[] marcarPontuacao() {
        int[] pontuacaoEquipe = new int[4];

        for (int i = 0; i < 4; i++) {
            System.out.print("Pontuação para o " + quartoVigente[i] + " quarto: ");
            pontuacaoEquipe[i] = scanner.nextInt();
        }
        return pontuacaoEquipe;
    }

    public static int somarPontuacoes(int[] pontuacoes) {
        int soma = 0;

        for (int pontuacao : pontuacoes) {
            soma += pontuacao;
        }

        return soma;
    }

    public static void definirEquipeVencedora() {
        int somaA = somarPontuacoes(equipeA);
        int somaB = somarPontuacoes(equipeB);

        if (somaA > somaB) {
            System.out.println("Equipe vencedora: A");
        } else if (somaB > somaA) {
            System.out.println("Equipe vencedora: B");
        } else {
            System.out.println("Empatou! Redirecionando para prorrogação...");
            marcarPontuacaoProrrogacao();
        }

        imprimirPlacar();
    }

    public static void marcarPontuacaoProrrogacao() {
        System.out.println("Pontuação da prorrogação EQUIPE A");
        equipeA = marcarPontuacao();

        System.out.println("Pontuação da prorrogação EQUIPE B");
        equipeB = marcarPontuacao();

        definirEquipeVencedora();
    }

    public static void imprimirVetor(int[] vetor) {
        for (int valor : vetor) {
            System.out.print(valor + " ");
        }
        System.out.println();
    }

    public static void imprimirQuartos(String[] vetor) {
        for (String quarto : vetor) {
            System.out.print(quarto + " ");
        }
        System.out.println();
    }

    public static void imprimirPlacar() {
        System.out.println("Placar:");
        System.out.print("Quartos: ");
        imprimirQuartos(quartoVigente);
        System.out.print("Equipe A: ");
        imprimirVetor(equipeA);
        System.out.print("Equipe B: ");
        imprimirVetor(equipeB);
    }

    public static void main(String[] args) {
        System.out.println("Pontuação EQUIPE A");
        equipeA = marcarPontuacao();

        System.out.println("Pontuação EQUIPE B");
        equipeB = marcarPontuacao();

        definirEquipeVencedora();
    }
}
