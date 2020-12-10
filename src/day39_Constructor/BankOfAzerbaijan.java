package day39_Constructor;

import day37_CustomClass.Employee;

import java.util.ArrayList;

public class BankOfAzerbaijan {

    public static void main(String[] args) {

        ArrayList<Employee> employees =new ArrayList<>();
        employees.add(HumanResource.employee1);
        employees.add(HumanResource.employee2);
        employees.add(HumanResource.employee3);
        employees.add(HumanResource.employee4);
        employees.add(HumanResource.employee5);

        for (Employee each:employees) {
            System.out.println(each);
        }
    }
}
