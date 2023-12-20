package oop1;

public class MusicPlayerMain3 {
    public static void main(String[] args) {
        MusicPlayer musicPlayer = new MusicPlayer();
        musicPlayer.on();
        musicPlayer.on();
        musicPlayer.on();
        musicPlayer.decreaseVolume();
        musicPlayer.checkVolumeStatus();
        musicPlayer.off();

    }

}
