package DailyExercise.Dec_14_StaticBlock;

import day37_CustomClass.Employee;

import java.util.ArrayList;
import java.util.Arrays;

public class BankOfAzerbayijan {

    public static void main(String[] args) {

        ArrayList<Employee> employees=new ArrayList<>();

        employees.add(HumanResources.employee1);
        employees.add(HumanResources.employee2);
        employees.add(HumanResources.employee3);
        employees.add(HumanResources.employee4);
        employees.add(HumanResources.employee5);
        System.out.println(Arrays.asList(employees));
    }
}
