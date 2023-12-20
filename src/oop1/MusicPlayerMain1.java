package oop1;

public class MusicPlayerMain1 {

    public static void main(String[] args) {
        int volume = 0;

        Boolean switchOn=false;

        switchOn=true;
        System.out.println("음악 플레이어를 시작합니다.");

        //볼륨증가
        ++volume;
        System.out.println("볼륨은: "+ volume);
        //볼륨증가
        ++volume;
        System.out.println("볼륨은: "+ volume);
        //볼륨감소
        --volume;
        System.out.println("볼륨은: "+ volume);
        //볼륨상태확인
        if (switchOn){
            System.out.println("현재 플레이어의 상태는? "+switchOn);
        } else if (switchOn) {
            System.out.println("현재 플레이어의 상태는 OFF");
        }
        //음악플레이어 끄기
        switchOn=false;
        System.out.println("음악 플레이어를 종료합니다.");
    }
}
