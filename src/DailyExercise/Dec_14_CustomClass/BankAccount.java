package DailyExercise.Dec_14_CustomClass;

import java.time.LocalDate;

public class BankAccount {

    public String accountName;
    public String  accountNumber;
    public double availableBalance=0;

    public void setInfo(String accountName,String accountNumber){
        this.accountName=accountName;
        this.accountNumber=accountNumber;


    }

    @Override
    public String toString() {
        return  "\ndate= "+ LocalDate.now()+
                "\nAccount Name= " + accountName +
                "\nAccount Number= " + accountNumber +
                "\nAvailable Balance= " + availableBalance;
    }

    public void deposit(double amount){
        availableBalance+=amount;
    }

    public void withDraw(double amount){
        availableBalance-=amount;
    }


}
