/**
 * Created by james on 09/07/2017.
 */
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Chelsea");
        dog.eat();
        dog.breath();
        Parrot parrot = new Parrot("Australian Ringneck");
        parrot.eat();
        parrot.breath();
        parrot.fly();
        Penguin penguin = new Penguin("Pingu");
        penguin.fly();
    }
}
