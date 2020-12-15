package DailyExercise.Dec_14_CustomClass;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Employee {

    public  String name,jobTitle,ID,CompanyName;
    public double salary;
    public LocalDate hireDate;
    public char gender;


    public void setInfo(String name, char gender,String jobTitle,String ID,String CompanyName,double salary,LocalDate hireDate){

        this.name=name;
        this.jobTitle=jobTitle;
        this.ID=ID;
        this.CompanyName=CompanyName;
        this.salary=salary;
        this.hireDate=hireDate;
        this.gender=gender;
    }

    @Override
    public String toString() {
        DateTimeFormatter df = DateTimeFormatter.ofPattern("YYYY.MM.dd");
        return  "name= " + name +
                "\njobTitle= " + jobTitle +
                "\nID= " + ID +
                "\nCompanyName= " + CompanyName +
                "\nsalary=" + salary +
                "\nhireDate=" + hireDate.format(df) +
                "\ngender=" + gender ;
    }

    public void working(){
        System.out.println(name+ " is working");
    }

    public void meeting(){
        System.out.println(name+ " is meeting");
    }
}
