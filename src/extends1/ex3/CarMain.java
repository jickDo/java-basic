package extends1.ex3;

public class CarMain {

    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.charge();
        electricCar.move();

        GasCar gasCar = new GasCar();
        gasCar.fillUp();
        gasCar.move();
    }
}
