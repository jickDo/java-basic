package access.cart;

public class Item {
    private String name;
    private int price;
    private int quantity;

    public Item(String name,int price,int quantity) {
        this.name= name;
        this.price= price;
        this.quantity= quantity;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getName() {
        return name;
    }
}
