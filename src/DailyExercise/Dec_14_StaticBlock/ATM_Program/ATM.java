package DailyExercise.Dec_14_StaticBlock.ATM_Program;

import java.util.Scanner;

public class ATM {
    public void run(Account account) throws InterruptedException {
        LogIn login=new LogIn();

        Scanner scanner=new Scanner(System.in);

        System.out.println("WELCOME to BANK OF AMERICA.....");
        System.out.println("**********************************");
        System.out.println("  User Input ");
        System.out.println("**********************************");

        int InputCount=3;

        while (true){

            if (login.login(account)) {
                System.out.println("Succesfull input...");
                break;
            }else {
                System.out.println("Uncorrect Username or password. Please try again!");
                InputCount-=1;
                System.out.println("Remaining Input: "+InputCount);
            }
            if (InputCount==0){
                System.out.println("You can't input anymore! You logged in wrong username or password 3 times ...");

                return;
            }
        }

        System.out.println("**********************************");

        while (true) {
            String transactions = "1.Balance\n" +
                    "2.Deposite\n" +
                    "3.Withdrawal\n" +
                    " Push \'q\' to Quit ";

            System.out.println(transactions);
            System.out.println("Please choose your transaction: ");
            String choosing = scanner.next();

            if (choosing.equals("1")) {
                System.out.println(account.balance);
                System.out.println("Do you want continue for another transaction?(Y/N)");
                String New=scanner.next();
                if (New.equalsIgnoreCase("y")){
                    continue;
                }else {
                    return;
                }
            } else if (choosing.equals("2")) {
                System.out.println("deposit amount: ");
                account.deposit(scanner.nextInt());
                System.out.println("Do you want continue for another transaction?(Y/N)");
                String New=scanner.next();
                if (New.equalsIgnoreCase("y")){
                    continue;
                }else {
                    return;
                }

            } else if (choosing.equals("3")) {
                System.out.println("withdrawal amount: ");
                account.withdrawal(scanner.nextInt());
                System.out.println("Do you want continue for another transaction?(Y/N)");
                 String New=scanner.next();
                if (New.equalsIgnoreCase("y")){
                   continue;
                 }else {
                         return;
                 }


            } else if (choosing.equals("q")) {

                return;

            }else {
                System.out.println("Wrong choice!! Please try again...");
                Thread.sleep(3000);

            }
        }






    }

}
