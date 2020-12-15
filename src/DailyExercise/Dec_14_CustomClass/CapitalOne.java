package DailyExercise.Dec_14_CustomClass;

public class CapitalOne {

    public static void main(String[] args) {

        BankAccount costumer1=new BankAccount();
        costumer1.setInfo("ibrahim", "000213313554");
        costumer1.deposit(12000);
        costumer1.deposit(20000);
        costumer1.withDraw(10000);
        System.out.println(costumer1);

        BankAccount costumer2 =new BankAccount();
        costumer2.setInfo("whalid","684654132");
        costumer2.deposit(200);
        costumer2.deposit(2000);
        costumer2.withDraw(1000);
        System.out.println(costumer2);

    }
}
