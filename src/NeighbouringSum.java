// DestaClasse.esteMetodo()
import java.util.Scanner;

public class NeighbouringSum {
    public static void main(String[] args) throws Exception {
        int lenght;
        int[] intArray;
        int[] sumOfPairs;

        Scanner scanner = new Scanner(System.in);

        lenght = SwitchPosition.howManyElements(scanner);
        

        sumOfPairs = sumOfNeighbours(intArray);
        
        scanner.close();
    }

}
