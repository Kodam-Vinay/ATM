import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Account acc = new Account();
        int option=1;
        boolean loop=true;
        try{
       while(loop)
       {
        System.out.println("1-Balance");
        System.out.println("2-Withdraw");
        System.out.println("3-Deposit Money");
        System.out.println("4-Exit");
        System.out.println("select any option :");
        option = s.nextInt();
        switch(option){
           case 1:
               System.out.println("your account current balance is : "+acc.Balance);
               break;
           case 2:
               System.out.println("remaining balance is : "+acc.WithdrawMoney());
               System.out.println("transaction successful");
               break;
           case 3:
               System.out.println("updated balance : "+acc.DepositMoney());
               System.out.println("transaction successful");
                break;
           case 4:
             loop=false;
             break;
            default:
                System.out.println("please select between 1-3 only");
               
                break;
        }
       }
       }
       catch(InputMismatchException e) {

         System.out.println("Please enter number only. Exit");
       }
        

}
}

