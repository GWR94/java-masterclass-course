import java.util.ArrayList;

/**
 * Created by james on 19/06/2017.
 */
public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("James", 54.96);
        Customer anotherCustomer;
        anotherCustomer = customer;
        anotherCustomer.setBalance(12.18);
        System.out.println("Balance for customer " + customer.getName() + " is " + customer.getBalance());

        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(1);
        integerArrayList.add(3);
        integerArrayList.add(4);

        for(int i=0; i<integerArrayList.size(); i++) {
            System.out.println(i + ": " + integerArrayList.get(i));
        }

        integerArrayList.add(1, 2);

        for(int i=0; i<integerArrayList.size(); i++) {
            System.out.println(i + ": " + integerArrayList.get(i));
        }

    }
}
