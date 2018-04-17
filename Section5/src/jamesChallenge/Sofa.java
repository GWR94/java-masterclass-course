package jamesChallenge;

/**
 * Created by HP on 19/05/2017.
 */
public class Sofa {
    private int seats;
    private Dimension dimension;
    private String colour;

    public Sofa(int seats, Dimension dimension, String colour) {
        this.seats = seats;
        this.dimension = dimension;
        this.colour = colour;
    }

    public int getSeats() {
        return seats;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public String getColour() {
        return colour;
    }
}
