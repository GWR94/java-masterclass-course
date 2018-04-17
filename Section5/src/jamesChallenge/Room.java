package jamesChallenge;

/**
 * Created by HP on 19/05/2017.
 */
public class Room {
    private Sofa sofa;
    private TV tv;
    private Photo photo;
    private Bed bed;


        public Room(Sofa sofa, TV tv, Photo photo, Bed bed) {
        this.sofa = sofa;
        this.tv = tv;
        this.photo = photo;
        this.bed = bed;
    }

    public void changePhoto(String photoName) {
        photo.setName(photoName);
        System.out.println("New photo is " + photoName);
    }

    public void makeBed() {
        System.out.println("Bedroom -> making bed");
        bed.make();
    }

    public void turnOnTV() {
        System.out.println("TV -> Turning on");
        tv.turnOn();
    }

    public Sofa getSofa() {
        return sofa;
    }

    public TV getTv() {
        return tv;
    }

    public Photo getPhoto() {
        return photo;
    }

    public Bed getBed() {
        return bed;
    }
}
