
/**
 * Created by HP on 26/05/2017.
 */
public class DeluxeBurger extends Hamburger {
    private String chipsType;
    private String drink;
    private double price = 6.00;

    public DeluxeBurger(String breadType, String meat, String chipsType, String drink) {
        super(breadType, meat);
        super.addAddition1("Chips", 2.00);
        super.addAddition1("Drink", 1.5);
        this.chipsType = chipsType;
        this.drink = drink;
    }

    @Override
    public double itemizeHamburger() {
        double hamburgerPrice = price;
        System.out.println("Deluxe Burger with " + this.chipsType.toLowerCase() + " chips and a " + this.drink.toLowerCase() +
                            " on " + getBreadType().toLowerCase() + " roll, \nwith a " + getMeat().toLowerCase() + "patty costs £"
                            + df.format(hamburgerPrice) + "p \n    _______________________________" );
        return hamburgerPrice;
    }

    @Override
    public void addAddition1(String name, double price) {
        System.out.println("Cannot add additional items to Deluxe Hamburger!");    }

    @Override
    public void addAddition2(String name, double price) {
        System.out.println("Cannot add additional items to Deluxe Hamburger!");
    }

    @Override
    public void addAddition3(String name, double price) {
        System.out.println("Cannot add additional items to Deluxe Hamburger!");
    }

    @Override
    public void addAddition4(String name, double price) {
        System.out.println("Cannot add additional items to Deluxe Hamburger!");    }
}
