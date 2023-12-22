package access.ex;

public class MaxCounterMain {

    public static void main(String[] args) {
        MaxCounter counter = new MaxCounter(10);

        System.out.println("현재 count의 값은? "+counter.getCount());
        counter.increment();
        counter.increment();
        counter.increment();
        counter.increment();
        counter.increment();
        counter.increment();
        counter.increment();
        System.out.println("현재 count의 값은? "+counter.getCount());
        counter.increment();
        counter.increment();
        counter.increment();
        System.out.println("현재 count의 값은? "+counter.getCount());
        counter.increment();


    }
}
