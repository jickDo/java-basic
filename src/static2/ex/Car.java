package static2.ex;

public class Car {

    private String model;
    private static int count;

    public Car(String model) {
        this.model = model;
        count++;
        System.out.println("차량 구입, 이름: "+model);
    }

    public static void showTotalCars(){
        System.out.println("지금까지 구매한 차량의 수는? "+ count);
    }
}
