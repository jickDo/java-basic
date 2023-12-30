package poly.ex.pay1;

public interface PayPlatform {
    void pay();
    void deposit(int amount);

    void validAmount(int amount);
}
