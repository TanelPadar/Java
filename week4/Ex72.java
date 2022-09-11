package week4;

public class Ex72 {
    public static void main(String[] args) {

        Account MattsAccount = new Account("Matt's account in Switzerland",1000.00);
        Account MysAccount = new Account("Matt's account in Switzerland",0);
        Account A = new Account("A's account", 100.00);
        Account B = new Account("B's account", 0.0);
        Account C = new Account("C's account", 0.0);


        System.out.println("Initial state");
        System.out.println(MattsAccount);
        System.out.println(MysAccount);

        MattsAccount.withdrawal(100);
        System.out.println("Matt's account balance is now: "+MattsAccount.saldo());
        MysAccount.deposit(100);
        System.out.println("My's Swiss account balance is now: "+MysAccount.saldo());

        System.out.println("Final state");
        System.out.println(MattsAccount);
        System.out.println(MysAccount);

        transfer(A,B,50);
        transfer(B,C,25);
    }

    public static void transfer(Account from, Account to, double amount){
        from.withdrawal(amount);
        to.deposit(amount);
    }



}
