package jamesChallenge;

/**
 * Created by james on 22/05/2017.
 */
public class TV {

    private String manufacturer;
    private String model;
    private Dimension dimension;

    public TV(String manufacturer, String model, Dimension dimension) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.dimension = dimension;
    }

    public void turnOn() {
        System.out.println("TV turned on!");
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public Dimension getDimension() {
        return dimension;
    }
}
