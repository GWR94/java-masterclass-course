/**
 * Created by james on 11/05/2017.
 */
public class Main {
    public static void main(String[] args) {
        Car porsche = new Car();
        Car volkswagen = new Car();

        porsche.setModel("Carrera");
        volkswagen.setModel("Polo");
        System.out.println("Model is: " + porsche.getModel());
        System.out.println("Model is: " + volkswagen.getModel());

    }
}
