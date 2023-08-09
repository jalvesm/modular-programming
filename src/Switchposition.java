import java.util.Scanner;

public class Switchposition {

    public static int[] getUserInput(int length) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
        System.out.println("Type the " + (i+1) + "st number: ");
        int num = scanner.nextInt();
            array[i] = num;
        }
        scanner.close();

        return array;
    }

    public static int[] switchArrayPosition(int[] givenArray) {
        //int aux;
        int size = givenArray.length;
        for (int i = 0; i < size/2; i++) {
            int aux = givenArray[i];
            givenArray[i] = givenArray[size - 1 - i];
            givenArray[size - 1 - i] = aux;
        }
        return givenArray;
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int length = 6;
        int[] userArray = getUserInput(length);
        int[] swapped = switchArrayPosition(userArray);
        
        for (int i = 0; i <= swapped.length; i++) {
            System.out.println(swapped[i]);
        }
    }
}
