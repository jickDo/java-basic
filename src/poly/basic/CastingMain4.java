package poly.basic;


//다운 캐스팅을 자동으로 하지 않는 이유
public class CastingMain4 {

    public static void main(String[] args) {
        Parent parent1 = new Child();
        Child child = (Child) parent1;

        child.childMethod(); //문제없음

        Parent parent2 = new Parent();
        Child child2 = (Child) parent2;
        child2.childMethod();

        //new Parent() 로 생성시 자바의 힙메모리 구조에서 Child없이 Parent구조만 생성
        //따라서 parent 변수를 Child로 다운캐스팅을 해도 그 대상이 없어서 ClassCastException가 발생

    }
}
