package oop1;

public class MusicPlayerMain2 {
    public static MusicPlayerData musicPlayerData = new MusicPlayerData();
    public static void main(String[] args) {

        on(musicPlayerData);

        //볼륨증가
        increaseVolume(musicPlayerData);
        //볼륨증가
        increaseVolume(musicPlayerData);
        //볼륨감소
        decreaseVolume(musicPlayerData);
        //볼륨상태확인
        checkVolumeStatus(musicPlayerData);
        //음악플레이어 끄기
        off(musicPlayerData);
    }

    static void on(MusicPlayerData musicPlayerData){
        musicPlayerData.switchOn=true;
        System.out.println("음악 플레이어를 시작합니다.");
    }

    static void off(MusicPlayerData musicPlayerData){
        musicPlayerData.switchOn=false;
        System.out.println("음악 플레이어를 종료합니다.");
    }

    static void increaseVolume(MusicPlayerData musicPlayerData){
        ++musicPlayerData.volume;
        System.out.println("볼륨은: "+ musicPlayerData.volume);
    }

    static void decreaseVolume(MusicPlayerData musicPlayerData){
        --musicPlayerData.volume;
        System.out.println("볼륨은: "+ musicPlayerData.volume);
    }

    static void checkVolumeStatus(MusicPlayerData musicPlayerData){
        if (musicPlayerData.switchOn){
            System.out.println("현재 플레이어의 상태는? "+musicPlayerData.switchOn);
        } else if (musicPlayerData.switchOn) {
            System.out.println("현재 플레이어의 상태는 OFF");
        }
    }

}
