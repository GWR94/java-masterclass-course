/**
 * Created by james on 10/05/2017.
 */
public class FeetAndInchesToCM {
    public static void main(String[] args) {
        calculateFeetAndInchesToCm(6,0);
        calculateFeetAndInchesToCm(94);
    }

    public static double calculateFeetAndInchesToCm(int feet, int inches) {
        if (inches < 12 && inches >= 0 && feet >= 0) {
            int feetToInch = feet * 12;
            int total = feetToInch + inches;
            double cm = total * 2.54;
            System.out.println(feet + " feet, " + inches + " inches is " + cm + " centimeters");
            return cm;
        }
        System.out.println("Error, incorrect input!");
        return -1;
    }

    public static double calculateFeetAndInchesToCm(int inches) {
        if (inches >= 0) {
            int inchToFeet = inches / 12;
            int leftoverInches = inches % 12;
            double cm = calculateFeetAndInchesToCm(inchToFeet, leftoverInches);
            return cm;
        }
        return -1;
    }
}