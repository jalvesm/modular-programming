import java.util.Scanner;

public class Data {
    
    /**
     * Declaração de classe para input do usuário;
     */
    static Scanner dadoDoTeclado;

    /**
     * Recolhe mensagem personalizada informada no programa principal.
     * @param mensagem Mensagem a ser exibida.
     * @return String lida do usuário.
     */
    public static String leitura(String mensagem) {
        System.out.println("\n" + mensagem + ": ");
        return dadoDoTeclado.nextLine();
    }

    /**
     * Define em um vetor os dias da semana de sábado a domingo. Faz uso da operação modular para ciclo relativo ao ano e semana. Retorna o dia da semana relativo à data informada.
     * @param day O dia informado pelo usuário.
     * @param month O mês informado pelo usuário.
     * @param year O ano informado pelo usuário.
     * @return String indicando o dia da semana relativo à data informada. 
     */
    public static String getDayOfWeek(int day, int month, int year) {
        String[] daysOfWeek = { "sábado", "domingo", "segunda-feira", "terça-feira", "quarta-feira", "quinta-feira",
                "sexta-feira" };

        if (month < 3) {
            month += 12;
            year--;
        }

        int modularYearValue = year % 100; // k
        int getThousandValue = year / 100; // j

        int dayOfWeek = (day + 13 * (month + 1) / 5 + modularYearValue + modularYearValue / 4 + getThousandValue / 4
                + 5 * getThousandValue) % 7;

        return daysOfWeek[dayOfWeek];
    }

    /**
     * Divide a data informada pelo usuário para obter o dia.
     * @param date Data informada pelo usuário.
     * @return Inteiro com o valor do dia 
     */
    public static int getDay(String date) {
        String[] detalhes = date.split("/");
        int dia = Integer.parseInt(detalhes[0]);
        return dia;
    }

    /**
     * Divide a data informada pelo usuário para obter o mês.
     * @param date Data informada pelo usuário.
     * @return Inteiro com o valor do mês .
     */

    public static int getMonth(String date) {
        String[] detalhes = date.split("/");
        int mes = Integer.parseInt(detalhes[1]);
        return mes;
    }

    /**
     * Divide a data informada pelo usuário para obter o ano.
     * @param date Data informada pelo usuário.
     * @return Inteiro com o valor do ano 
     */
    public static int getYear(String date) {
        String[] detalhes = date.split("/");
        int ano = Integer.parseInt(detalhes[2]);
        return ano;
    }

    /**
     * Nota: remover função pois está redundante.
     * Recebe como parâmetro a data informada pelo usuário, chama o método 'getDayOfWeek()' e retorna o dia da semana relativo.
     * @param date Data informada pelo usuário.
     * @return dia da semana relativo à data informada pelo usuário.
     */
    public static String getFinallyDayOfWeek(String date) {
        String diaDasemana;
        int dia = getDay(date);
        int mes = getMonth(date);
        int ano = getYear(date);

        diaDasemana = getDayOfWeek(dia, mes, ano);
        return diaDasemana;
    }
    
    /**
     * Compara tamanho entre os valores relativos à ano, mês e dia, previamente informados pelo usuário.
     * @param date1 A primeira data informada pelo usuário.
     * @param date2 A primeira data informada pelo usuário.
     * @return Valor booleano caso a data seja maior.
     */
    public static boolean isDateGreaterThan(String date1, String date2) {
        int day1 = getDay(date1);
        int month1 = getMonth(date1);
        int year1 = getYear(date1);

        int day2 = getDay(date2);
        int month2 = getMonth(date2);
        int year2 = getYear(date2);

        if (year1 > year2) {
            return true;
        } else if (year1 < year2) {
            return false;
        } else {
            if (month1 > month2) {
                return true;
            } else if (month1 < month2) {
                return false;
            } else {
                return day1 > day2;
            }
        }
    }

    /**
     * Valida se uma data é menor do que a outra. Lógica: se a data1 não for maior e não for igual à data2, função retorna valor booleano True. 
     * @param date1 A primeira data informada pelo usuário.
     * @param date2 A segunda data informada pelo usuário.
     * @return Valor booleano true.
     */
    public static boolean isDateLessThan(String date1, String date2) {
        return !isDateGreaterThan(date1, date2) && !isDateEqual(date1, date2);
    }

    /**
     * Valida se uma data é igual à outra. 
     * @param date1 A primeira data informada pelo usuário.
     * @param date2 segunda data informada pelo usuário.
     * @return Valor booleano true caso os anos, meses e dias informados pelo usuário sejam iguais.
     */
    public static boolean isDateEqual(String date1, String date2) {
        int day1 = getDay(date1);
        int month1 = getMonth(date1);
        int year1 = getYear(date1);

        int day2 = getDay(date2);
        int month2 = getMonth(date2);
        int year2 = getYear(date2);

        return year1 == year2 && month1 == month2 && day1 == day2;
    }

    /**
     * Valida a ordem das datas informadas pelo usuário por meio de uma estrutura de decisão.
     * Imprime se uma data informada é maior, menor ou igual à outra.
     * @param date1 A primeira data informada pelo usuário.
     * @param date2 segunda data informada pelo usuário.
     * @return Retorno vazio.
     */
    public static void printOrder(String date1, String date2) {
        if (isDateGreaterThan(date1, date2)) {
            System.out.println(date1 + " é maior do que " + date2);
        } else if (isDateLessThan(date1, date2)) {
            System.out.println(date1 + " é menor do que " + date2);
        } else if (isDateEqual(date1, date2)) {
            System.out.println(date1 + " é igual a " + date2);
        }
    }

    public static void main(String[] args) {
        dadoDoTeclado = new Scanner(System.in);

        String date1 = leitura("Digite uma data no formato DD/MM/AAAA");
        System.out.println(Aplicado08.dataValida(date1));

        String result = getFinallyDayOfWeek(date1);
        System.out.println("A data " + date1 + " será em uma/um " + result + ".");

        String date2 = leitura("Digite uma segunda data no formato DD/MM/AAAA");
        System.out.println(Aplicado08.dataValida(date2));

        String result2 = getFinallyDayOfWeek(date2);
        System.out.println("A data " + date2 + " será em uma/um " + result2 + ".\n");

        System.out.println("Ordem das datas:");
        printOrder(date1, date2);
    }
}
