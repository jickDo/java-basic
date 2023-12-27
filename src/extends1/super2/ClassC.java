package extends1.super2;

public class ClassC extends ClassB{

    public ClassC(){

        super(10,20); //만약 부모의 클래스가 기본생성자가 없다면 직접 호출 해줘야한다.
        System.out.println("c의 생성자");
    }
}
