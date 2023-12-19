package ref.ex;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductOrderMain2 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<ProductOrder> productOrders =new ArrayList<>();

        System.out.print(" 입력할 주문의 수량을 입력하세요: ");
        int num= scanner.nextInt();

        for(int i=0; i<num; i++){
            System.out.println(i+1+ "번째 주문정보를 입력하세요");
            addArrayList(productOrders);
        }

        printOrders(productOrders);
        int total = getTotalAmount(productOrders);
        System.out.println("총 금액은? "+total);


    }

    static void addArrayList(ArrayList<ProductOrder> productOrders){
        System.out.print(" 상품명: ");
        String productName= scanner.nextLine();
        scanner.nextLine();
        System.out.print(" 가격: ");
        int price= scanner.nextInt();
        System.out.print(" 수량: ");
        int quantity= scanner.nextInt();
        productOrders.add(createOrder(productName,price,quantity));
    }

    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder productOrder = new ProductOrder();
        productOrder.productName = productName;
        productOrder.price = price;
        productOrder.quantity = quantity;
        return productOrder;
    }

    static void printOrders(ArrayList<ProductOrder> orders) {
        for (ProductOrder order : orders) {
            System.out.println("상품명: " + order.productName + " 가격: " + order.price + " 수량: " + order.quantity);
        }
    }

    static int getTotalAmount(ArrayList<ProductOrder> orders) {
        int total = 0;
        for (ProductOrder order : orders) {
            total += order.price * order.quantity;
        }
        return total;
    }
}
