/**
 * Created by james on 25/05/2017.
 */
public class Main {
    public static void main(String[] args) {
        HealthyBurger healthyBurger = new HealthyBurger();
        healthyBurger.addAddition1("Tomato", 0.5);
        healthyBurger.addAddition2("Cucumber", 0.2);
        healthyBurger.addAddition3("Onion", 0.2);
        healthyBurger.addAddition4("Lettuce", 0.5);
        healthyBurger.addAddition5("Peppers", 0.2);
        healthyBurger.addAddition6("Spring Onion", 0.2);
        healthyBurger.itemizeHamburger();
        Hamburger hamburger = new Hamburger ("White", "Beef");
        hamburger.addAddition1("Onion", 0.2);
        hamburger.addAddition2("Cheese", 0.5);
        hamburger.addAddition3("Lettuce", 0.5);
        hamburger.addAddition4("Tomato", 0.2);
        hamburger.itemizeHamburger();
        DeluxeBurger deluxeBurger = new DeluxeBurger("White", "Beef", "Cheesy", "Coke");
        deluxeBurger.itemizeHamburger();
        deluxeBurger.addAddition1("Cant do this", 123123123);

    }
}