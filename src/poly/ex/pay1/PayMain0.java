package poly.ex.pay1;

import java.util.Scanner;

public class PayMain0 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            PayService payService = new PayService();

            System.out.println("결제할 수단을 입력하세요: ");
            String platform = scanner.nextLine();

            System.out.println("입금할 금액을 입력하세요");
            int amount = scanner.nextInt();

            PayPlatform pay = PlatFormStore.checkPlatForm(platform);
            //결제
            payService.processPay(pay, amount);

        }
    }