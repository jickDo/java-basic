package static2;

public class DecoData {

    private int instanceValue;
    private static int staticValue;

    public static void staticCall(){
        staticValue++; //정적 변수 호출 가능
        staticMethod(); //정적 메서드 호출가능

//       인스턴수 변수 호출 불가능 instanceValue++;
//        인스턴스 함수 호출 불가능 instanceMethod();
    }

    public void instanceCall(){
        instanceValue++;
        instanceMethod();
        staticValue++;
        staticMethod();
        //인스턴스에서는 전부 접근가능
    }

    private void instanceMethod(){
        System.out.println("instanceValue = "+ instanceValue);
    }

    private static void staticMethod(){
        System.out.println("staticValue= "+staticValue);
    }
}
