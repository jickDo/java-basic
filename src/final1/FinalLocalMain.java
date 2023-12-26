package final1;

public class FinalLocalMain {

    public static void main(String[] args) {
        final int data1;
        data1 = 10; //최초할당
//        data1 = 20; 두번은 할당불가
        final int data2 = 20;
//        data2 = 30;
    }

    static void method(final int a){
//        a=20; 파라미터가 final 이여도 같다.
    }
}
