package poly.ex.pay1;

public abstract class PlatFormStore {

    public static PayPlatform checkPlatForm(String type){
        if (type.equals("kakao")){
            return new KakaoPay();
        } else if (type.equals("naver")) {
            return new NaverPay();
        } else if (type.equals("newPay")) {
            return new NewPay();
        }else {
            return new BadPlatForm();
        }
    }
}
