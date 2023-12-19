package ref.ex;

public class ProductOrderMain2 {

    public static void main(String[] args) {

        ProductOrder java = createOrder("java", 20000, 1);
        ProductOrder jpa = createOrder("jpa", 10000, 3);
        ProductOrder springBoot = createOrder("springBoot", 15000, 10);

        ProductOrder[] productOrder = {java, jpa, springBoot};

        printOrders(productOrder);
        int total = getTotalAmount(productOrder);
        System.out.println("총 금액은? "+total);


    }

    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder productOrder = new ProductOrder();
        productOrder.productName = productName;
        productOrder.price = price;
        productOrder.quantity = quantity;
        return productOrder;
    }

    static void printOrders(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println("상품명: " + order.productName + " 가격: " + order.price + " 수량: " + order.quantity);
        }
    }

    static int getTotalAmount(ProductOrder[] orders) {
        int total = 0;
        for (ProductOrder order : orders) {
            total += order.price * order.quantity;
        }
        return total;
    }
}
