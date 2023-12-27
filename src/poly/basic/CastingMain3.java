package poly.basic;


//upCasting
public class CastingMain3 {

    public static void main(String[] args) {
        Child child = new Child();
        Parent parent = (Parent) child; //원래 캐스팅 방식 생략권장
        Parent parent2 = child; // 생략한 방식

        parent.parentMethod();
        parent2.parentMethod();
    }
}