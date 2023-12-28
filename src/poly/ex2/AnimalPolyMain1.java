package poly.ex2;

public class AnimalPolyMain1 {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();
        Duck duck = new Duck();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);
        soundAnimal(duck);
        //부모는 자식을 담을수 있다 만세 삼창!!!
        //여러개의 타입을 다형적 참조로 Animal로 통일
        //메서드 오버라이딩으로 실행시점에 각각의 메서드 출력
    }

    private static void soundAnimal(Animal animal){
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 \n");
    }
}
