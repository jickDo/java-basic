package access;

public class BankAccount {

    private int balance;

    public BankAccount() {
        balance=0;
    }

    public void deposit(int amount){
        if (isAmountValid(amount)){
            balance+=amount;
        }else {
            System.out.println("잘못된 입급입니다.");
        }
    }

    public void withdraw(int amount){
        if (isAmountValid(amount)&& balance>=amount){
            balance-=amount;
        }else {
            System.out.println("잘못된 출금입니다.");
        }
    }

    public void getBalance(){
        System.out.println("현재 금액은: "+balance);
    }


    private boolean isAmountValid(int amount){
        return amount>0;
    }



}
