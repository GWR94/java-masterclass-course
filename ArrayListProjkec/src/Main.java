import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Created by james on 01/06/2017.
 */
public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Contacts contact = new Contacts();

    public static void main(String[] args) {

        boolean quit = false;
        int choice = 0;
        printInstruction();
        while(!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    contact.addContact();
                    break;
                case 2:
                    contact.findContact();

            }
        }

    }
}
