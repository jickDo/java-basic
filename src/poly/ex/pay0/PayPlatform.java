package poly.ex.pay0;

public interface PayPlatform {
    void pay();
    void deposit(int amount);

    void validAmount(int amount);
}
