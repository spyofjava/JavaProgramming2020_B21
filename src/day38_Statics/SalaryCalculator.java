package day38_Statics;

public class SalaryCalculator {
    public  double hourlyRate, weeklyHours, stateTaxRate, federalTaxRate, salary, salaryAfterTax;

    public void setInfo(double hourlyRate,double weeklyHours,double stateTaxRate ,double federalTaxRate){
        this.hourlyRate = hourlyRate;
        this.weeklyHours = weeklyHours;
        this.stateTaxRate = (stateTaxRate >1)? stateTaxRate/100 :stateTaxRate;
        this.federalTaxRate = (federalTaxRate > 1)? federalTaxRate/100 :federalTaxRate;
        this.salary = calculateSalaryAfterTax();
        this.salaryAfterTax = calculateSalaryAfterTax();
    }


    public double calculateSalary(){
        return  hourlyRate*weeklyHours*52;
    }

    public double calculateStateTax(){
        return salary*stateTaxRate;
    }

    public double calculateFederalTax(){
        return salary*federalTaxRate;
    }

    public  double calculateTotalTax(){
        return calculateFederalTax()+calculateStateTax();
    }

    public double  calculateSalaryAfterTax(){
        return salary-calculateTotalTax();
    }


    @Override
    public String toString() {
        return "SalaryCalculator{" +
                "hourlyRate=" + hourlyRate +
                ", salary=" + salary +
                ", salaryAfterTax=" + salaryAfterTax +
                '}';
    }
}
