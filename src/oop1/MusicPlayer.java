package oop1;

public class MusicPlayer {
    int volume = 0;
    boolean isOn = false;


    void on(){
        isOn=true;
        System.out.println("음악 플레이어를 시작합니다.");
    }

    void off(){
        isOn=false;
        System.out.println("음악 플레이어를 종료합니다.");
    }

    void increaseVolume(){
        ++volume;
        System.out.println("볼륨은: "+ volume);
    }

    void decreaseVolume(){
        --volume;
        System.out.println("볼륨은: "+ volume);
    }

    void checkVolumeStatus(){
        if (isOn){
            System.out.println("현재 플레이어의 상태는? "+isOn);
        } else if (isOn) {
            System.out.println("현재 플레이어의 상태는 OFF");
        }
    }
}
