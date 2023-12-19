package ref;

public class NullMain2 {

    public static void main(String[] args) {
        Data data = null;
        data.value = 10;
        System.out.println("data = "+data.value);
        //nullPointerException은 null에 .(dot)이 찍혔을때 발생하는 오류이다.
    }
}
