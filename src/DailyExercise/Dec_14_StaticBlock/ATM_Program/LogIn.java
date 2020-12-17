package DailyExercise.Dec_14_StaticBlock.ATM_Program;

import java.util.Scanner;

public class LogIn {

    public boolean login(Account account) {
        Scanner scanner = new Scanner(System.in);
        String username;
        String password;
        System.out.println("User name: ");
        username = scanner.nextLine();
        System.out.println("Password: ");
        password = scanner.nextLine();

        if (account.getUserName().equals(username) && account.getPassword().equals(password)){
            return true;
        }else {
            return false;
        }


    }
}
