package poly.ex;

public class SenderMain {

    public static void main(String[] args) {
       Sender[] senders = {new EmailSender(),new FaceBookSender(),new SmsSender()};

       for(Sender sender:senders){
           sender.sendMessage("환영합니다");
       }
    }
}