public class Grocery extends Item implements Discount, Tax {
    private double price;
    private double units;
    private double discount;

    public Grocery(String itemCode, String name, double price, double units, double discount) {
        super(itemCode, name);
        this.price = price;
        this.units = units;
        this.discount = discount;
    }
    @Override
    public double computeTax() {
        return 0;
    }

    @Override
    public double computeDiscount() {
        return(units * price) * (discount / 100.00);
    }

    public double computeTotalPrice() {
        double discount = computeDiscount();
        return(units*price) - discount + computeTax();
    }
    public void displayGrocery(){
        super.display();
        System.out.println("units: " + this.units + ", price: $" + this.price + ", Discount: " + this.discount + "%, Tax: " +
                "0");
    }
}
