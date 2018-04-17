import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by HP on 05/06/2017.
 */
public class Branch {
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Customer> customers = new ArrayList<>();
    private String name;

    public Branch(String name) {
        this.name = name;
    }

    public static void addCustomer() {
        System.out.println("Enter customer name: ");
        String name = scanner.nextLine();
        System.out.println("Enter initial deposit amount: ");
        Double firstDeposit = scanner.nextDouble();
        ArrayList<Double> customerTransactions = new ArrayList<>();
        customerTransactions.add(firstDeposit);
        Customer newCustomer = new Customer(name, customerTransactions);
    }

    public void newTransaction() {
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        if(findCustomer(name) >= 0) {
            System.out.println("Please enter transaction amount: ");
            double transcation = scanner.nextDouble();
            Customer currentCustomer = returnCustomer(name);
            ArrayList<Double> customerTransactions = currentCustomer.getTransactions();
            customerTransactions.add(transcation);
            System.out.println(currentCustomer.getTransactions());
        }
        System.out.println("Error! There is no customer with the name of " + name + " on record!");
    }

    private static int findCustomer(Customer customer) {
        return customers.indexOf(customer);
    }

    private int findCustomer(String name) {
        for(int i=0; i<customers.size(); i++) {
           Customer customer = this.customers.get(i);
           if(customer.getName().equals(name)) {
               return i;
           }
        }
        return -1;
    }

    public Customer returnCustomer(String name) {
        int position = findCustomer(name);
        if(position >= 0) {
            return this.customers.get(position);
        }
        return null;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void printCustomers() {
        System.out.println("Customers with the " + this.name + " branch are: \n");

        for(int i=0; i<customers.size(); i++) {
            System.out.println(i + ".   " + this.customers.get(i).getName());
        }
    }

    public String getName() {
        return name;
    }
}
