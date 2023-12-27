package extends1.super2;

public class ClassB extends ClassA {

    public ClassB(int a) {
        super();
        System.out.println("class b 생성자 a = "+a);
    }

    public ClassB(int a , int b){
        super(); //기본 생성자 생략 가능
        System.out.println("Class b 의 생성자 a= "+ a +" b = "+b);
    }
}
