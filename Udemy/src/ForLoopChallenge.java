/**
 * Created by james on 11/05/2017.
 */
public class ForLoopChallenge {
    public static void main(String[] args) {
        int primeCount = 0;
        for (int i=56; i<90; i++) {
            if(isPrime(i)) {
                primeCount++;
                System.out.println(i + " is a prime number!");
                if (primeCount == 6) {
                    System.out.println("Exiting loop as 3 prime numbers found...");
                    break;
                }
            }
        }
    }
    private static boolean isPrime(int n) {

        int primeCount = 0;
        if (n == 1) {
            return false;
        }
         for (int i=2; i<= n/2; i++) {
            if(n % i == 0) {
                return false;
            }
         }
         return true;
    }
}
