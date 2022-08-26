import java.util.Scanner;

class Account{
Scanner s = new Scanner(System.in);
    long updateBalance;
     long Balance = 100;
     long DepositMoney;
     long WithdrawMoney;
    public long Balance(){
        return Balance;
    }
    public long DepositMoney(){
        System.out.print("how much money u want to deposit :");
        long DepositMoney = s.nextLong();
        DepositMoney = Balance+DepositMoney;
        return DepositMoney;
    }
    public long WithdrawMoney(){
        System.out.print("how much money you want :");
        WithdrawMoney = s.nextLong();
        if(Balance > WithdrawMoney){
            WithdrawMoney = Balance - WithdrawMoney;
        }else{
            System.out.print("no more money");
        }
   return WithdrawMoney;
    }


    }

