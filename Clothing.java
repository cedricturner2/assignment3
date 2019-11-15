public class Clothing extends Item implements Discount, Tax {
    private String brand;
    private double price;
    private double units;
    private double discount;
    final double taxp = 8.5;

    public Clothing(String itemCode, String name, String brand, double price, double units, double discount) {
        super(itemCode, name);
        this.brand = brand;
        this.price = price;
        this.units = units;
        this.discount = discount;
    }

    @Override
    public double computeTax() {
        return ((units * price) - computeDiscount()) * 8.5/100;
    }

    @Override
    public double computeDiscount() {
        return(units*price) * (discount / 100.00);
    }

    double computeTotalPrice() {
        return (units*price) - computeDiscount() + computeTax();
    }
    public void displayClothing() {
        super.display();;
        System.out.println("units: " + this.units + ", price: $" +
                this.price + ", brand: " + this.brand + ", discount: " +
                this.discount + "%");
    }
}
