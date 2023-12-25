package static1;

public class DataCountMain2 {

    public static void main(String[] args) {
        Counter counter = new Counter();
        Data2 data1 = new Data2("A",counter);
        System.out.println("A의 카운터는? "+ counter.count);

        Data2 data2 = new Data2("B",counter);
        System.out.println("B의 카운터는? "+ counter.count);

        Data2 data3 = new Data2("C",counter);
        System.out.println("C의 카운터는? "+ counter.count);

        Data2 data4 = new Data2("D",counter);
        System.out.println("D의 카운터는? "+ counter.count);

    }
}
