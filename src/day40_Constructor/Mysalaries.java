package day40_Constructor;

import java.util.ArrayList;
import java.util.Arrays;

public class Mysalaries {
    public static void main(String[] args) {

        SalaryCalculator salary1 = new SalaryCalculator(40, 55, 9, 22);

        SalaryCalculator salary2 = new SalaryCalculator(40, 55, 0, 23);

        SalaryCalculator salary3 = new SalaryCalculator(45, 35, 8, 21);

        SalaryCalculator salary4 = new SalaryCalculator(45, 65, 8, 24);

        SalaryCalculator salary5 = new SalaryCalculator(50, 70, 9, 22);


        // print the maximum salary after tax


        ArrayList<SalaryCalculator> salaries = new ArrayList<>();
        salaries.addAll(Arrays.asList(salary1, salary2, salary3, salary4, salary5));

        double maxSalaryAfterTax = salaries.get(0).salaryAfterTax;
        double minSalaryAfterTax = salaries.get(0).salaryAfterTax;
        for (SalaryCalculator each : salaries) {
            maxSalaryAfterTax = Math.max(each.salaryAfterTax, maxSalaryAfterTax);
            minSalaryAfterTax = Math.min(each.salaryAfterTax,minSalaryAfterTax);
            System.out.println(each.salaryAfterTax);

        }

        System.out.println("Max: "+ maxSalaryAfterTax);
        System.out.println("Min: "+ minSalaryAfterTax);

        System.out.println("=================================================================");

    }
}
