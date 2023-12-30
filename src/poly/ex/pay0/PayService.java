package poly.ex.pay0;

public class PayService {

    public void processPay(String option, int amount){
        if (option=="kakao"){
            KakaoPay kakaoPay = new KakaoPay();
            kakaoPay.deposit(amount);
            kakaoPay.pay();
        } else if (option=="naver") {
            NaverPay naverPay = new NaverPay();
            naverPay.deposit(amount);
            naverPay.pay();
        } else if (option=="bad") {
            System.out.println("잘못된 입력입니다");
        }

    }
}
