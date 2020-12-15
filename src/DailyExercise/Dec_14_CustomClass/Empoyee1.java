package DailyExercise.Dec_14_CustomClass;

public class Empoyee1 {


    public String name, company, jobTitle, ID, gender;
    public  int weeklyHours;
    public double hourlyRate, salary;



    public void setInfo(String name, String company, String jobTitle, String ID,String gender,int weeklyHours, double hourlyRate){
        this.name=name;
        this.company=company;
        this.jobTitle=jobTitle;
        this.ID=ID;
        this.gender=gender;
        this.weeklyHours=weeklyHours;
        this.hourlyRate=hourlyRate;
        this.salary=calculateSalary();

    }

    public double calculateSalary(){
        salary=weeklyHours*hourlyRate*52;
        return  salary;
    }

    public double calculateTax(double stateTaxRate,double federalTaxRate){
        double totalTax=calculateSalary()*(stateTaxRate+federalTaxRate);
        return totalTax;
    }

    @Override
    public String toString() {
        return  "name= " + name +
                "\ncompany= " + company +
                "\njobTitle= " + jobTitle +
                "\nID= " + ID +
                "\ngender= " + gender +
                "\nweeklyHours= " + weeklyHours +
                "\nhourlyRate= " + hourlyRate +
                "\nsalary= " + salary;

    }
}
