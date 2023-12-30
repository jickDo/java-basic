package poly.ex;

public class FaceBookSender implements Sender{
    @Override
    public void sendMessage() {
        System.out.println("페이스북에 발송합니다: 환영합니다!");
    }
}
