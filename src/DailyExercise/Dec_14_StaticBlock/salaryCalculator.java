package DailyExercise.Dec_14_StaticBlock;

import java.util.ArrayList;
import java.util.Arrays;

public class salaryCalculator {

    public double hourlyRate,weeklyHours,federalTaxRate,stateTaxRate,salary,salaryAfterTax;
    public ArrayList<salaryCalculatorObjects> salarylist=new ArrayList();


    public void setInfo(double hourlyRate,double weeklyHours,double stateTaxRate,double federalTaxRate){
        if (stateTaxRate>1){
            stateTaxRate/=100;
        }
        if (federalTaxRate>1){
            federalTaxRate/=100;
        }

        this.hourlyRate=hourlyRate;
        this.weeklyHours=weeklyHours;
        this.stateTaxRate=stateTaxRate;
        this.federalTaxRate=federalTaxRate;
        salary=calculateSalary();
        salaryAfterTax=calculatesalaryAfterTax();
        this.salarylist=salarylist;
    }

    public double calculateSalary(){
        return hourlyRate*weeklyHours*52;
    }
    public double calculateStateTax(){
        return salary*stateTaxRate;
    }
    public double calculateFederalTax(){
        return salary*federalTaxRate;
    }
    public double  calculateTotalTax(){
        return calculateFederalTax()+calculateStateTax();
    }
    public double calculatesalaryAfterTax(){
        return (calculateSalary()-calculateTotalTax());
    }



    public String toString() {
        return  "\nhourlyRate= " + hourlyRate +
                "\nweeklyHours= " + weeklyHours +
                "\nfederalTaxRate= " + federalTaxRate +
                "\nstateTaxRate= " + stateTaxRate +
                "\nsalary= " + salary +
                "\nsalaryAfterTax= " + salaryAfterTax;
    }
}
