/**
 * Created by james on 25/05/2017.
 */
public class HealthyBurger extends Hamburger {
    private String addition5;
    private double addition5Price;
    private String addition6;
    private double addition6Price;
    private double price = 4.50;
    private String name = "Healthy Burger";

    public HealthyBurger() {
        super("Brown Rye Bread", "Veggie");
    }

    @Override
    public void addAddition1(String name, double price) {
        super.addAddition1(name, price);
    }

    @Override
    public void addAddition2(String name, double price) {
        super.addAddition2(name, price);
    }

    @Override
    public void addAddition3(String name, double price) {
        super.addAddition3(name, price);
    }

    @Override
    public void addAddition4(String name, double price) {
        super.addAddition4(name, price);
    }

    public void addAddition5(String name, double price) {
        this.addition5 = name;
        this.addition5Price = price;
    }

    public void addAddition6(String name, double price) {
        this.addition6 = name;
        this.addition6Price = price;
    }

    @Override
    public double itemizeHamburger() {
        double hamburgerPrice = this.price;

        System.out.println("A " + this.name + " on a " + getBreadType().toLowerCase() + " roll, with a " + getMeat().toLowerCase() + " patty costs £" + df.format(this.price) + "p");
        if(getAddition1() != null) {
            hamburgerPrice += getAddition1Price();
            System.out.println("Added " + getAddition1() + " at the extra cost of £" + df.format(getAddition1Price()) + "p");
        }
        if(getAddition2() != null) {
            hamburgerPrice += getAddition2Price();
            System.out.println("Added " + getAddition2() + " at the extra cost of £" + df.format(getAddition2Price()) + "p");
        }
        if(getAddition3() != null) {
            hamburgerPrice += getAddition3Price();
            System.out.println("Added " + getAddition3() + " at the extra cost of £" + df.format(getAddition3Price()) + "p");
        }
        if(getAddition4() != null) {
            hamburgerPrice += getAddition4Price();
            System.out.println("Added " + getAddition4() + " at the extra cost of £" + df.format(getAddition4Price()) + "p");
        }
        if(addition5 != null) {
            hamburgerPrice += addition5Price;
            System.out.println("Added " + addition5 + " at the extra cost of £" + df.format(addition5Price) + "p");
        }
        if(addition6 != null) {
            hamburgerPrice += addition6Price;
            System.out.println("Added " + addition6 + " at the extra cost of £" + df.format(addition6Price) + "p");
        }

        System.out.println("The final cost of your " + this.name + " is £" + df.format(hamburgerPrice) + "p \n     _______________________________");
        return hamburgerPrice;
    }
}
