package DailyExercise.Dec_14_StaticBlock;

import java.util.ArrayList;
import java.util.Arrays;

public class salaryCalculatorObjects {
    public static void main(String[] args) {

        salaryCalculator s1=new salaryCalculator();
        salaryCalculator s2=new salaryCalculator();
        salaryCalculator s3=new salaryCalculator();
        salaryCalculator s4=new salaryCalculator();
        salaryCalculator s5=new salaryCalculator();
        salaryCalculator s6=new salaryCalculator();
        salaryCalculator s7=new salaryCalculator();

        s1.setInfo(55,45,0.05, 22);
        s2.setInfo(45,48,0.05, 22);
        s3.setInfo(45,42,0.05, 22);
        s4.setInfo(47,41,0.05, 22);
        s5.setInfo(53,47,0.05, 22);
        s6.setInfo(60,43,0.05, 22);
        s7.setInfo(58,44,0.05, 22);

        ArrayList<salaryCalculator>salarylist=new ArrayList<>(Arrays.asList(s1,s2,s3,s4,s5,s6,s7));
        for (salaryCalculator each:salarylist){
            System.out.println(each.salary);
        }
        System.out.println("=======================");
        for (salaryCalculator each:salarylist){
            System.out.println(each.salaryAfterTax);
        }
        System.out.println("=======================");

        for (salaryCalculator each:salarylist){
            System.out.println(each.calculateTotalTax());
        }
        System.out.println("=======================");

        for (salaryCalculator each:salarylist){
            System.out.println(each);
        }


        double min = salarylist.get(0).salary;
        double max = salarylist.get(0).salary;
        for (salaryCalculator each:salarylist){
            if (each.salary > max) {
                max = each.salary;
            }
            if (each.salary < min) {
                min = each.salary;
            }
        }

        System.out.println("Minimum salary: "+min);
        System.out.println("Maximum salary: "+max);


    }
}
