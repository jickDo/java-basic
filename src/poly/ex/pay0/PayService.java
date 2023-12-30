package poly.ex.pay0;

public class PayService {

    public void processPay(PayPlatform platform, int amount){
        platform.deposit(amount);
        platform.pay();
    }

    public void processPay(String bad, int amount){
        if (bad=="bad"){
            System.out.println("잘못된 결제 수단입니다.");
        }
    }
}
