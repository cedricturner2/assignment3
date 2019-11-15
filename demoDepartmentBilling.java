public class demoDepartmentBilling {
    public static void main(String[] args) {
        // objects for grocery class
        Grocery groceryItem1 = new Grocery("10", "Bread", 1.99, 2, 0);
        Grocery groceryItem2 = new Grocery("11", "Grapes", 1.00, 3, 1);

        // objects for clothing class
        Clothing clothingItem1 = new Clothing("20", "Jeans", "American Eagle", 60, 2, 0);
        Clothing clothingItem2 = new Clothing("21", "Shirt", "Ralph Lauren", 40, 1, 2);

        double totalPrice = 0;
        totalPrice = groceryItem1.computeTotalPrice() + groceryItem2.computeTotalPrice()
                + clothingItem1.computeTotalPrice() + clothingItem2.computeTotalPrice();
        groceryItem1.displayGrocery();
        groceryItem2.displayGrocery();
        clothingItem1.displayClothing();
        clothingItem2.displayClothing();

        System.out.println("Amount Due: $" + totalPrice);
    }
}
