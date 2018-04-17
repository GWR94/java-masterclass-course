import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * Created by james on 17/07/2017.
 */
public class Main {
    public static void main(String[] args) {
        try {
            int result = divide();
            System.out.println("= " + result);
        } catch(ArithmeticException e) {
            System.out.println(e.toString());
            System.out.println("Unable to perform division");
        }
    }
    private static int divide() {
        int x, y;
        try {
            x = getInt();
            y = getInt();
            System.out.println("X: " + x + ", Y: " + y);
            return x / y;
        } catch (NoSuchElementException e) {
            throw new ArithmeticException("No suitable input");
        } catch (ArithmeticException e) {
            throw new ArithmeticException("Tried to divide by zero");
        }
    }




    private static int getInt() {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter an integer: ");
        while(true) {
            try {
                return s.nextInt();
            } catch(InputMismatchException e) {
                s.nextLine();
                System.out.println("Please enter a number using only the digits 0 to 9");
            } catch (NoSuchElementException x) {
                s.nextLine();
                System.out.println("Please insert a value: ");
            }
        }
    }
}
