/**
 * Created by james on 11/05/2017.
 */
public class WhileChallenge {
    public static void main(String[] args) {

        int count = 1;
        int evenCount = 0;

        do {
            if(isEvenNumber(count)) {
                System.out.println(count + " is an even number!");
                evenCount++;
            }
            count++;
        }
        while (evenCount != 5);
    }
    public static boolean isEvenNumber(int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }
}
