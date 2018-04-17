import java.util.Scanner;

public class Main {
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please enter a number: ");
        X x = new X(s.nextInt());
        x.x();
    }
}
