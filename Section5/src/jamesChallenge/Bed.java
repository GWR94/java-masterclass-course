package jamesChallenge;

/**
 * Created by james on 23/05/2017.
 */
public class Bed {
    private String duvetCover;
    private String matress;
    private String size;

    public Bed(String duvetCover, String matress, String size) {
        this.duvetCover = duvetCover;
        this.matress = matress;
        this.size = size;
    }

    public String getDuvetCover() {
        return duvetCover;
    }

    public String getMatress() {
        return matress;
    }

    public String getSize() {
        return size;
    }

    public void make() {
        System.out.println("Making bed!");
    }
}
