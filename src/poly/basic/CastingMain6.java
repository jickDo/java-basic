package poly.basic;

public class CastingMain6 {

    public static void main(String[] args) {
        Parent parent1 = new Parent();
        System.out.println("parent1 호출");
        call(parent1);

        Parent parent2 = new Child();
        System.out.println("parent2 호출");
        call(parent2);
    }

    private static void call(Parent parent) {
        parent.parentMethod();
        //자바 16부터 지원하는 기능 instanceof 사용과 동시에 변수선언
        if (parent instanceof Child child){
            System.out.println("Child 인스턴스 맞음");
//            Child child = (Child) parent;
            child.childMethod();
        }else {
            System.out.println("Child 인스턴스 아님");
        }
    }
}
