import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Partida {
    Times timeA;
    Times timeB;
    private int golsTimeA;
    private int golsTimeB;
    private String dataPartida;

    private static final Set<String> datasGeradas = new HashSet<>();
    private static final Calendar dataInicial = new GregorianCalendar(2023, Calendar.JANUARY, 1);
    private static final Calendar dataFinal = new GregorianCalendar(2023, Calendar.DECEMBER, 31);
    private static final SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");


    public static String gerarDataAleatoria() {
        while (true) {
            long msAleatorios = (long) (Math.random() * (dataFinal.getTimeInMillis() - dataInicial.getTimeInMillis() + 1) + dataInicial.getTimeInMillis());
            Calendar dataAleatoria = new GregorianCalendar();
            dataAleatoria.setTimeInMillis(msAleatorios);
            String dataFormatada = formatoData.format(dataAleatoria.getTime());

            if (datasGeradas.add(dataFormatada)) {
                return dataFormatada;
            }
        }
    }

    public static int gerarNumeroAleatorioDeGol(int minimo, int maximo) {
        Random gerador = new Random();
        int numeroAleatorio = gerador.nextInt(maximo - minimo + 1) + minimo;
        return numeroAleatorio;
    }

    public void gravarDadosEmArquivo(String nomeArquivo) {
        try (FileWriter escritor = new FileWriter(nomeArquivo, true)) {
            escritor.write(dataPartida + "," + timeA.getNome() + "," + golsTimeA + "," + timeB.getNome() + "," + golsTimeB);
        } catch (IOException e) {
            System.err.println("Ocorreu um erro ao gravar os dados no arquivo: " + e.getMessage());
        }
    }

    public Partida(Times timeA, Times timeB) {
        this.dataPartida = gerarDataAleatoria();
        this.timeA = timeA;
        this.timeB = timeB;
        this.golsTimeA = gerarNumeroAleatorioDeGol(0,4);
        this.golsTimeB = gerarNumeroAleatorioDeGol(0,4);
    }

    public boolean deuEmpate() {
        return this.golsTimeA == this.golsTimeB;
    }

    public int incrementaVencedor() {
        int vitorias = 0;
    
        if (!deuEmpate()) {
            if (this.golsTimeA > this.golsTimeB) {
                vitorias++;
            } else {
                vitorias++;
            }
        }
        return vitorias;
    }
    
    public static void main(String[] args) {
        Times timeA = new Times("Time A");
        Times timeB = new Times("Time B");
        Partida partida = new Partida(timeA, timeB);
        partida.gravarDadosEmArquivo("resultPartida.txt");
    }

}
