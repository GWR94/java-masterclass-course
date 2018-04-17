import java.util.ArrayList;

/**
 * Created by james on 01/06/2017.
 */
public class Contacts {
    private String name;
    private String number;

    public ArrayList<String> contacts = new ArrayList<>();
    public ArrayList<String> numbers = new ArrayList<>();

    public void addContact(String name, String number) {
        int namePosition = findContact(name);
        int numberPosition = findContactNumber(number);

        if(numberPosition == -1) {
            System.out.println("Error! There is already a contact with that number!");
        }
        else if(namePosition == -1) {
            System.out.println("Error! There is already a contact with that name!");
        }
        else {
            contacts.add(name);
            numbers.add(number);
        }
    }

    public int findContactNumber(String numberSearch) { return numbers.indexOf(numberSearch); }

    public int findContact(String contactSearch) {
        return contacts.indexOf(contactSearch);
    }

    public void modifyContactName(String oldname, String newName) {
        int position = findContact(oldname);
        contacts.set(position, newName);
    }

    public void modifyContactNumber(String contact, String oldNumber, String newNumber) {
        int position = findContact(contact);
        numbers.set(position, newNumber);
    }

    public void searchContact(String contactSearch) {
        int position = findContact(contactSearch);
        if(position == -1) {
            System.out.println("There is no contact with that name in the list.");
        }
        else {
            System.out.println(contactSearch + " found. Number associated is: " + numbers.get(position));
        }
    }
}
