package day05_AritmeticOperators;

public class SalaryCalculator {
    public static void main(String[] args) {
        int salary=10000;
        double stateTaxRate=0.08,federalTaxRate=0.21,stateTax=stateTaxRate*salary,
                federalTax=federalTaxRate*salary,totalTax=federalTax+stateTax,
                salaryaftertax=salary-(stateTax+federalTax);

        System.out.println("==================================");
        System.out.println("Your salary is:        $"+salary);
        System.out.println("Your State Tax:        $"+stateTax);
        System.out.println("Your federal Tax:      $"+federalTax);
        System.out.println("Your total Tax:        $"+totalTax);
        System.out.println("Your salary afer tax:  $"+salaryaftertax);
        System.out.println("==================================");



    }
}
