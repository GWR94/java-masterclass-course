import java.text.DecimalFormat;

public class Hamburger {
    private String breadType;
    private String meat;
    private double price = 4.00;
    private String name = "Hamburger";

    private String addition1;
    private double addition1Price;
    private String addition2;
    private double addition2Price;
    private String addition3;
    private double addition3Price;
    private String addition4;
    private double addition4Price;

    DecimalFormat df = new DecimalFormat("###0.00");

    public Hamburger(String breadType, String meat) {
        this.breadType = breadType;
        this.meat = meat;
    }

    public void addAddition1(String name, double price) {
        this.addition1 = name;
        this.addition1Price = price;
    }

    public void addAddition2(String name, double price) {
        this.addition2 = name;
        this.addition2Price = price;
    }

    public void addAddition3(String name, double price) {
        this.addition3 = name;
        this.addition3Price = price;
    }

    public void addAddition4(String name, double price){
        this.addition4 = name;
        this.addition4Price = price;
    }

    public String getBreadType() {
        return breadType;
    }

    public String getMeat() {
        return meat;
    }

    public String getAddition1() {
        return addition1;
    }

    public double getAddition1Price() {
        return addition1Price;
    }

    public String getAddition2() {
        return addition2;
    }

    public double getAddition2Price() {
        return addition2Price;
    }

    public String getAddition3() {
        return addition3;
    }

    public double getAddition3Price() {
        return addition3Price;
    }

    public String getAddition4() {
        return addition4;
    }

    public double getAddition4Price() {
        return addition4Price;
    }

    public double itemizeHamburger() {
        double hamburgerPrice = this.price;
        System.out.println("A " + this.name + " on a " + this.breadType.toLowerCase() + " roll, with a " + getMeat().toLowerCase() +
                            " patty costs £" + df.format(this.price) + "p");
        if(addition1 != null) {
            hamburgerPrice += this.addition1Price;
            System.out.println("Added " + addition1 + " at the extra cost of £" + df.format(addition1Price) + "p");
        }
        if(addition2 != null) {
            hamburgerPrice += this.addition2Price;
            System.out.println("Added " + addition2 + " at the extra cost of £" + df.format(addition2Price) + "p");
        }
        if(addition3 != null) {
            hamburgerPrice += this.addition3Price;
            System.out.println("Added " + addition3 + " at the extra cost of £" + df.format(addition3Price) + "p");
        }
        if(addition4 != null) {
            hamburgerPrice += this.addition4Price;
            System.out.println("Added " + addition4 + " at the extra cost of £" + df.format(addition4Price) + "p");
        }
        System.out.println("The final cost of your " + this.name + " is £" + df.format(hamburgerPrice) + "p \n     _______________________________");
        return hamburgerPrice;
    }
}