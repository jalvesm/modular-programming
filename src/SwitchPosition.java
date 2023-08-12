import java.util.Scanner;

public class SwitchPosition {

    public static int howManyElements(Scanner scanner) {
        int numOfElements;
        
        System.out.print("How many elements do you wish to insert? ");
        numOfElements = scanner.nextInt();
        System.out.print("\n");
        
        return numOfElements;
    }

    public static int[] getUserInput(int length, Scanner scanner) {
        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            System.out.print("Type the " + (i + 1) + "st integer: ");

            int num = scanner.nextInt();
            array[i] = num;
        }

        return array;
    }

    public static int[] switchArrayPosition(int[] givenArray) {
        int size = givenArray.length;

        for (int i = 0; i < size / 2; i++) {
            int aux = givenArray[i];
            givenArray[i] = givenArray[size - 1 - i];
            givenArray[size - 1 - i] = aux;
        }

        return givenArray;
    }

    public static void printArray(int[] givenArray) {

        for (int i = 0; i < givenArray.length; i++) {
            System.out.print(" " + givenArray[i]);
        }
    }

    public static void main(String[] args) throws Exception {
        int length;
        int[] userArray;
        
        Scanner scanner = new Scanner(System.in);

        length = howManyElements(scanner);
        userArray = getUserInput(length, scanner);

        System.out.print("\nHere is the array you've typed: {");
        printArray(userArray);
        System.out.println(" }");

        userArray = switchArrayPosition(userArray);

        System.out.print("\nHere is the array with the positions switched: {");
        printArray(userArray);
        System.out.println(" }");

        scanner.close();
    }
}
