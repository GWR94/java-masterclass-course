package jamesChallenge;

/**
 * Created by HP on 19/05/2017.
 */
public class Main {

    public static void main(String[] args) {

        Dimension dimension = new Dimension(100, 100, 5);
        TV tv = new TV("Samsung", "Smart 3D TV", new Dimension(4000, 2000, 20));
        Photo photo = new Photo("myPhoto", dimension);
        Sofa sofa = new Sofa(5, new Dimension(1000, 400, 400), "blue");
        Bed bed = new Bed("White and Brown", "Memory Foam", "Double");
        Room myRoom = new Room(sofa, tv, photo, bed);
        myRoom.changePhoto("Test photo");
        myRoom.makeBed();
        myRoom.turnOnTV();
        myRoom.getTv().turnOn();

    }
}
