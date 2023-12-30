package poly.ex.pay0;

public class KakaoPay implements PayPlatform {
    private int money=0;
    @Override
    public void pay(int amount) {
        System.out.println("카카오 시스템과 연결합니다");
        System.out.println(amount+"원 결제 합니다");
        validAmount(amount);
    }

    @Override
    public void deposit(int amount) {
        System.out.println("카카오 시스템과 연결합니다");
        System.out.println("카카오 포인트를 충전합니다 "+amount);
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
