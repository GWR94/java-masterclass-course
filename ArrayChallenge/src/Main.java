import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by james on 28/05/2017.
 */
public class Main {
    public static void main(String[] args) {
        int[] myUnsortedArray = getIntegers(5);
        printArray(myUnsortedArray);
        sortArray(myUnsortedArray);
    }

    private static Scanner scanner = new Scanner(System.in);

    public static int[] getIntegers(int numbers) {
        System.out.println("Enter " + numbers + " integer values. \n");
        int[] values = new int[numbers];

        for (int i=0; i<numbers; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static void printArray(int[] array) {
        for (int i=0; i<array.length; i++) {
            System.out.println("Element " + i + " is " + array[i]);
        }
        System.out.println("_______________________");
    }

    public static void sortArray(int[] array) {
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " in the sorted array is " + array[i]);
        }
        System.out.println("_______________________");
    }
}
