package access;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        //시작 금액 출력
        account.getBalance();

        //입금
        account.deposit(10000);
        account.getBalance();

        //출금
        account.withdraw(5000);
        account.withdraw(6000);
        account.getBalance();

    }



}
