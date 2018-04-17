import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        for(int i=0; i<=20; i++) {
            integerArrayList.add(Integer.valueOf(i));
        }
        for(int i=0; i<=20; i++) {
            System.out.println(i + " ---> " + integerArrayList.get(i).intValue());
        }

        Integer myIntValue = 25;
        int myInt = myIntValue;

        ArrayList<Double> doubleArrayList = new ArrayList<>();
        for(double dbl = 0.0; dbl <= 10.0; dbl += 0.5) {
            doubleArrayList.add(dbl);
        }
        for(int i=0; i<doubleArrayList.size(); i++) {
            double value = doubleArrayList.get(i);
            System.out.println(i + " ----> " + value);
        }
    }
}
