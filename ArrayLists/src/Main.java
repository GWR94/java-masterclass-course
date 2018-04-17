import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by james on 29/05/2017.
 */
public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static ShoppingList shoppingList = new ShoppingList();

    public static void main(String[] args) {

        boolean quit = false;
        int choice = 0;
        printInstructions();
        while(!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    shoppingList.printShoppingList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:

                case 7:
                    quit = true;
                    break;
            }
        }

    }

    public static void processArrayList() {
        ArrayList<String> newArray = new ArrayList<String>();
        newArray.addAll(shoppingList.getShoppingList());

        ArrayList<String> nextArray = new ArrayList<String>(shoppingList.getShoppingList());
        String[] myArray = new String[shoppingList.getShoppingList().size()];
        myArray = shoppingList.getShoppingList().toArray(myArray);
    }

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice of options.");
        System.out.println("\t 1 - To print a list of shopping items.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item on the list.");
        System.out.println("\t 4 - To remove an item from the list.");
        System.out.println("\t 5 - To search for an item on the list.");
        System.out.println("\t 6 - To quit the application.");
    }

    public static void addItem(){
        System.out.println("Please enter your shopping item: ");
        shoppingList.addShoppingItem(scanner.nextLine().toLowerCase());
    }

    public static void modifyItem() {
        System.out.println("Enter item number: ");
        String itemNo = scanner.nextLine().toLowerCase();
        System.out.println("Enter replacement item: ");
        String newItem = scanner.nextLine().toLowerCase();
        shoppingList.modifyList(itemNo, newItem);
    }

    public static void removeItem() {
        System.out.println("Enter item name: ");
        String itemNo = scanner.nextLine().toLowerCase();
        scanner.nextLine();
        shoppingList.removeItem(itemNo);
    }

    public static void searchForItem() {
        System.out.println("Item to search for: ");
        String searchItem = scanner.nextLine();
        if(shoppingList.onFile(searchItem.toLowerCase())) {
            System.out.println("Found " + searchItem + " in the shopping list.");
        }
        else {
            System.out.println(searchItem + " is not in the shopping list.");
        }
    }
}
