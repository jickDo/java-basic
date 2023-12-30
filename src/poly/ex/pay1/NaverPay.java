package poly.ex.pay1;

public class NaverPay implements PayPlatform {
    private int money=0;
    @Override
    public void pay() {
        System.out.println(money+"원 결제 합니다");
        validAmount(money);
    }

    @Override
    public void deposit(int amount) {
        System.out.println("네이버 포인트를 충전합니다 "+amount);
        this.money+=amount;
    }

    @Override
    public void validAmount(int amount) {
        if (money>=amount){
            System.out.println("결제에 성공합니다");
        } else {
            System.out.println("잔액이 부족합니다");
        }
    }
}

