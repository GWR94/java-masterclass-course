/**
 * Created by james on 05/06/2017.
 */
public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("HSCB");
        bank.addBranch("Tonbridge");
        bank.addCustomer("Tonbridge", "James", 45.00);
        bank.addCustomer("Tonbridge", "Jon", 94.45);
        bank.addBranch("Maidstone");
        bank.addCustomer("Maidstone", "Jill", 78.00);
        bank.addCustomer("Maidstone", "Fred", 4.00);
        bank.listCustomers("Tonbridge", true);
        bank.listCustomers("Maidstone", false);

    }
}
