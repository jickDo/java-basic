package access;

import java.nio.file.attribute.UserPrincipalLookupService;

public class SpeakerMain1 {

    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);

        speaker.showVolume();
        speaker.volumeUp();
        speaker.volumeUp();
        speaker.volumeDown();
        speaker.volumeDown();
        speaker.showVolume();


        //필드에 직접 접근
//        System.out.println("필드에 직접 접근");
//        speaker.volume=200;
//        speaker.showVolume();
    }
}
