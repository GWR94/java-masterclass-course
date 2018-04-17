/**
 * Created by james on 11/05/2017.
 */
public class Car {
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if (validModel.equals("carrera") || validModel.equals("polo") || validModel.equals("golf")) {
            this.model = model;
        }
    }

    public String getModel() {
        return this.model;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getDoors() {
        return this.doors;
    }

}
