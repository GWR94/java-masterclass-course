import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by HP on 05/06/2017.
 */
public class Main {
    private static Scanner scanner = new Scanner(System.in);
    Bank myBank = new Bank();

    public static void main(String[] args) {

        boolean quit = false;
        printActions();
        while (!quit) {
            System.out.println("\nEnter Action: (Press 5 to show available actions)");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("\nClosing down...");
                    quit = true;
                    break;
                case 1:
                    Bank.newBranch();
                    break;
                case 2:
                    System.out.println("Which branch would you like to add a customer to?");
                    String branchName = scanner.nextLine();
                    ArrayList<Branch> branches = Bank.getBranches();
                    for (int i = 0; i < branches.size(); i++) {
                        if (branchName.equals(branches.get(i))) {
                            Branch currentBranch = branches.get(i);
                            currentBranch.addCustomer();
                            break;
                        } else {
                            System.out.println("No branch with that name! Please try again.");
                            break;
                        }
                    }
                case 3:
                    System.out.println("Which branch are you with?");
                    String branchCustomer = scanner.nextLine();
                    ArrayList<Branch> currentBranch1 = Bank.getBranches();
                    for (int i = 0; i < currentBranch1.size(); i++) {
                        if (branchCustomer.equals(currentBranch1.get(i))) {
                            Branch branch = currentBranch1.get(i);
                            branch.newTransaction();
                        } else {
                            System.out.println("No branch with that name! Please try again.");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Which branch are you with?");
                    branchName = scanner.nextLine();
                    ArrayList<Branch> branches2 = Bank.getBranches();
                    for (int i = 0; i < branches2.size(); i++) {
                        if (branchName.equals(branches2.get(i))) {
                            Branch thisBranch = branches2.get(i);
                            thisBranch.printCustomers();
                        }
                        else {
                            System.out.println("No branch with that name! Please try again.");
                        }
                    }
                    break;
                case 5:
                    printActions();
                    break;
            }

        }
    }

    private static void printActions() {
        System.out.println("\navailable actions:\npress");
        System.out.println("0 - to quit\n" +
                "1 - add new branch\n" +
                "2 - add new customer to branch\n" +
                "3 - new transaction for existing customer\n" +
                "4 - show list of customers in specific branch\n" +
                "5 - list of transactions for a specific customer.");
        System.out.println("Choose your action: ");
    }
}
