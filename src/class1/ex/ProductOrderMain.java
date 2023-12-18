package class1.ex;

public class ProductOrderMain {

    public static void main(String[] args) {
        ProductOrder java = new ProductOrder();
        java.productName="java";
        java.price=20000;
        java.quantity=1;

        ProductOrder jpa = new ProductOrder();
        jpa.productName="jpa";
        jpa.price=10000;
        jpa.quantity=3;

        ProductOrder springBoot = new ProductOrder();
        springBoot.productName="springBoot";
        springBoot.price=15000;
        springBoot.quantity=10;

        ProductOrder[] productOrder= {java,jpa,springBoot};

        int totalPrice = 0;
        for (ProductOrder o:productOrder){
            System.out.println("상품명: "+o.productName+" 가격: "+o.price+" 수량: "+ o.quantity);
            totalPrice+=(o.price*o.quantity);
        }
        System.out.println("총 금액은: "+ totalPrice);
    }
}
