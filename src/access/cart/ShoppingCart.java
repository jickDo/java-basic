package access.cart;

import java.util.ArrayList;

public class ShoppingCart {

    private final int MAX_COUNT = 10;
    private ArrayList<Item> items = new ArrayList<>();
    private int itemCount;

    public void displayItems(){
        for (Item item:items){
            System.out.println("이름: "+item.getName()+" 가격: "+item.getPrice()+ " 수량: "+ item.getQuantity());
        }
    }

    public void addItem(Item item){
        if (isCountValid()) {
            items.add(item);
            itemCount++;
        }
    }

    private boolean isCountValid(){
        if (itemCount<MAX_COUNT){
            return true;
        }else {
            System.out.println("장바구니가 가득찼습니다");
            return false;
        }
    }
}
