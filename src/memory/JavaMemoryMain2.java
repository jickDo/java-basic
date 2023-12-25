package memory;

public class JavaMemoryMain2 {

    public static void main(String[] args) {
        System.out.println("Main Start");
        method1();
        System.out.println("Main End");
    }

    static void method1() {
        System.out.println("Method1 Start");
        Data data1 = new Data(10);
        method2(data1);
        System.out.println("Method1 end");
    }

    static void method2(Data data1) {
        System.out.println("Method2 Start");
        System.out.println("data1의 값은? "+data1.getValue());
        System.out.println("Method2 End");

    }
}
