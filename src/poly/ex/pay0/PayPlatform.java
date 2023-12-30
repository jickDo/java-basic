package poly.ex.pay0;

public interface PayPlatform {
    void pay(int amount);
    void deposit(int amount);
    void validAmount(int amount);
}
