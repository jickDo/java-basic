package poly.ex1;

public class AnimalSoundMain1 {

    public static void main(String[] args) {
        Dog dog =new Dog();
        Caw caw =new Caw();
        Cat cat =new Cat();

        //동물 소리 테스트 시작
        dog.sound();
        caw.sound();
        cat.sound();
    }
    private static void sound(Caw caw){
        System.out.println("동물 소리 테스트 시작");
        caw.sound();
        System.out.println("동물 소리 테스트 끝");
    }
}
