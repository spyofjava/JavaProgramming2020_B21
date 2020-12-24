package day41_Encapsulation;
///////////////////////////////////////  ----  6  ----  /////////////////////////
public class BankOfAmerica_6 {

    public static void main(String[] args) {

        BankAccount_6 obj1 = new BankAccount_6("Josh", "Jones", 123456);

        System.out.println( obj1.getAccountHolder());
        System.out.println( obj1.getBalance()  );

        obj1.deposit(-200);
        obj1.availableBalance();

        System.out.println("=======================");

        obj1.deposit(100);
        obj1.availableBalance();

        // BankAccount.bankName = "Capital One";
        System.out.println(   BankAccount_6.bankName );

    }

}