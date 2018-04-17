import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by HP on 05/06/2017.
 */
public class Bank {
    private static ArrayList<Branch> branches = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void newBranch() {
        System.out.println("Please enter name of branch: ");
        String name = scanner.nextLine();
        Branch branch = new Branch(name);
        System.out.println("Would you like to add a customer to this branch?\n" +
                "Enter 0 for \"Yes\" or enter 1 for \"No\".");
        int decision = scanner.nextInt();
        if(decision == 0) {
            Branch.addCustomer();
        }
        else {
            return;
        }
    }

    public static ArrayList<Branch> getBranches() {
        return branches;
    }
}
