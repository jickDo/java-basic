package oop1;

public class MusicPlayerMain2 {
    public static MusicPlayerData musicPlayerData = new MusicPlayerData();
    public static void main(String[] args) {

        musicPlayerData.switchOn=true;
        System.out.println("음악 플레이어를 시작합니다.");

        //볼륨증가
        ++musicPlayerData.volume;
        System.out.println("볼륨은: "+ musicPlayerData.volume);
        //볼륨증가
        ++musicPlayerData.volume;
        System.out.println("볼륨은: "+ musicPlayerData.volume);
        //볼륨감소
        --musicPlayerData.volume;
        System.out.println("볼륨은: "+ musicPlayerData.volume);
        //볼륨상태확인
        if (musicPlayerData.switchOn){
            System.out.println("현재 플레이어의 상태는? "+musicPlayerData.switchOn);
        } else if (musicPlayerData.switchOn) {
            System.out.println("현재 플레이어의 상태는 OFF");
        }
        //음악플레이어 끄기
        musicPlayerData.switchOn=false;
        System.out.println("음악 플레이어를 종료합니다.");
    }
}
