package static1;

public class DataCountMain1 {

    public static void main(String[] args) {
        Data1 data1 = new Data1("A");
        System.out.println("A카운트는 : "+data1.count);

        Data1 data2 = new Data1("B");
        System.out.println("B카운트는 : "+data2.count);

        Data1 data3 = new Data1("C");
        System.out.println("C카운트는 : "+data3.count);

        //객체를 생성할때 마다 인스턴스 값또한 새로 생긴다.

    }
}
