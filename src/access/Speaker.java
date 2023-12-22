package access;

public class Speaker {
    private int volume;

    Speaker(int volume){
        this.volume= volume;
    }

    void volumeUp(){
        if (volume>=100){
            System.out.println("최대 볼륨입니다");
        }else{
            volume+=10;
            System.out.println("음량이 10 증가되었습니다");
        }
    }

    void volumeDown(){
        volume-=10;
        System.out.println("음량이 10 감소되었습니다");
    }

    void showVolume(){
        System.out.println("현재 음량은? "+volume);
    }
}
