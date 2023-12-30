package poly.ex;

public class SmsSender implements Sender{
    @Override
    public void sendMessage() {
        System.out.println("Sms에 발송합니다: 환영합니다!");
    }
}
