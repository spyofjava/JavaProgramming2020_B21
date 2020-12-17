package DailyExercise.Dec_14_StaticBlock.ATM_Program;

public class Account {


    public String userName;
    public String password;
    public double balance;

    public Account(String userName, String password, double balance) {
        this.userName = userName;
        this.password = password;
        this.balance = balance;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(int amount){
        balance+=amount;
        System.out.println("New balance: $"+balance);
    }

    public void withdrawal(int amount) {
        if (amount > balance) {
            System.out.println("There is not enough your balance!!!");
        } else {
            balance -= amount;
            System.out.println("New balance: $" + balance);
        }

    }


}
