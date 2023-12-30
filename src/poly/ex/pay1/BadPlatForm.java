package poly.ex.pay1;

public class BadPlatForm implements PayPlatform{


    @Override
    public void pay() {
        System.out.println("잘못된 접근입니다");
    }

    @Override
    public void deposit(int amount) {

    }

    @Override
    public void validAmount(int amount) {

    }
}
