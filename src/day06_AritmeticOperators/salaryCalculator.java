package day06_AritmeticOperators;

public class salaryCalculator {
    public static void main(String[] args) {

        /*
        double salary = 100000, stateTaxRate = 0.08, federalTaxRate = 0.21 ,
                stateTax =  salary *  stateTaxRate,  federalTax = salary * federalTaxRate ,
                totalTax = stateTax +federalTax, salaryAfterTax = salary - totalTax ;
        */

        double salary = 150000;
        double stateTaxRate = 0.09;
        double federalTaxRate = 0.25;

        double stateTax =  salary *  stateTaxRate ;
        double federalTax = salary * federalTaxRate;
        double totalTax = stateTax +federalTax;

        double salaryAfterTax = salary - totalTax;

        System.out.println("Your Salary is: $ " + salary);
        System.out.println("State tax is: $ " + stateTax);
        System.out.println("Federal tax is: $ " + federalTax);
        System.out.println("Total tax is: $ "+totalTax);
        System.out.println("Salary After Tax: $ "+salaryAfterTax);


    }
}
