/**
 * Created by james on 11/05/2017.
 */
public class ForLoops {
    public static void main(String[] args) {

        for (int i=2; i<9; i++) {
            System.out.println("£10,000 at " + i + "% interest = £" + String.format("%.2f", CalculateInterest(10000, i)));
        }
    }
    public static double CalculateInterest(double amount, double interestRate) {
        return (amount * (interestRate/100));
    }
}
