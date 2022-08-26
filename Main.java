import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Account acc = new Account();
        System.out.println("1-Balance");
        System.out.println("2-Withdraw");
        System.out.println("3-Deposit Money");
        System.out.println("4-exit");
        int option = s.nextInt();

        switch(option){
           case 1:
               System.out.print(acc.Balance());
               break;
           case 2:
               System.out.println(acc.WithdrawMoney());
               break;
           case 3:
               System.out.println(acc.DepositMoney());
       }

}}

