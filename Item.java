public class Item {
    private String itemCode;
    private String name;

    // the constructor
    public Item(String itemCode, String name) {
        this.itemCode = itemCode;
        this.name = name;
    }

    // display
    public void display(){
        System.out.println("Item code: " + this.itemCode + "\n Name: " + this.name);
    }
}
