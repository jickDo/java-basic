package access.cart;

public class ShoppingCartMain {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("자바",10000,1);
        Item item2 = new Item("코틀린",15000,1);
        Item item3 = new Item("클린코드",20000,1);
        Item item4 = new Item("자바 인 액션",30000,1);

        cart.addItem(item1);
        cart.addItem(item2);
        cart.addItem(item3);
        cart.addItem(item4);

        cart.displayItems();
    }
}
