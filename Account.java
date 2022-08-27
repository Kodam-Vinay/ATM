import java.util.Scanner;

class Account{
Scanner s = new Scanner(System.in);
    long updateBalance;
     long Balance = 100;
     long DepositMoney;
     long WithdrawMoney;
    
    public long DepositMoney(){
        System.out.println("how much money u want to deposit :");
        long DepositMoney = s.nextLong();
        Balance= Balance+DepositMoney;
        return Balance;
    }
    public long WithdrawMoney(){
        System.out.println("how much money you want :");
        WithdrawMoney = s.nextLong();
        if(Balance<=0) System.out.print("You Dont have money");
        if(Balance >=WithdrawMoney){
            Balance= Balance - WithdrawMoney;
            System.out.println(WithdrawMoney+" Rupees Withdraw has been Successfully. Available Balance is"+Balance);
        }else{
            System.out.println("You are only having Rupees "+Balance);
        }
   return Balance;
    }
    }

