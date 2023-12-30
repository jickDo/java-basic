package poly.ex.pay0;

public class PayMain0 {
        public static void main(String[] args) {
            PayService payService = new PayService();

            //kakao 결제
            KakaoPay kakaoPay = new KakaoPay();
            int amount1 = 5000;
            payService.processPay(kakaoPay, amount1);

            //naver 결제
            NaverPay naverPay = new NaverPay();
            int amount2 = 10000;
            payService.processPay(naverPay, amount2);

            //새로운 결제수단 추가
            NewPay newPay = new NewPay();
            int amount4 = 20000;
            payService.processPay(newPay,amount4);

            //잘못된 결제 수단 선택
            String payOption3 = "bad";
            int amount3 = 15000;
            payService.processPay(payOption3, amount3);
        }
    }