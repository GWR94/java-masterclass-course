package jamesChallenge;

/**
 * Created by james on 22/05/2017.
 */
public class Photo {
    private String name;
    private Dimension dimension;

    public void changePhoto(String newPhoto) {
        System.out.println("Photo changed to " + newPhoto);
        name = newPhoto;
    }

    public Photo(String name, Dimension dimension) {
        this.name = name;
        this.dimension = dimension;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dimension getDimension() {
        return dimension;
    }
}
