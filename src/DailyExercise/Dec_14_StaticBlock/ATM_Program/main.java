package DailyExercise.Dec_14_StaticBlock.ATM_Program;

import java.util.Scanner;

public class main {
    public static void main(String[] args) throws InterruptedException {

        Scanner scanner=new Scanner(System.in);
        ATM atm=new ATM();
        Account account1=new Account("i", "U",100000);
        atm.run(account1);
        Thread.sleep(1000);





    }
}
