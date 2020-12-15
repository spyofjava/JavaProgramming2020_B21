package DailyExercise.Dec_14_CustomClass;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class BankOfAmerica {
    public static void main(String[] args) {


        Employee[] employees = {new Employee(), new Employee(), new Employee(), new Employee(), new Employee()};
        employees[0].setInfo("Angelina Jolie", 'F', "Developer", "0001", "Bank of America", 400_000, LocalDate.of(2018, 4, 15));
        employees[1].setInfo("Brad Pitt", 'M', "Scrum Master", "0003", "Bank of America", 140_000, LocalDate.of(2016, 9, 14));
        employees[2].setInfo("Obi-Wan Kenobi", 'M', "BA", "0004", "Bank of America", 164000, LocalDate.of(2010, 2, 14));
        employees[3].setInfo("Ercan Civi", 'M', "SDET", "0005", "Bank of America", 164000.50, LocalDate.of(2000, 2, 14));
        employees[4].setInfo("John Snow", 'M', "CEO", "0006", "Bank of America", 240_000, LocalDate.of(2006, 2, 18));


        double minSalary = employees[0].salary;
        double maxSalary = employees[0].salary;
        String maxname = employees[0].name;
        String minname = employees[0].name;
        for (Employee each : employees) {
            if (each.salary > maxSalary) {
                maxSalary = each.salary;
                maxname = each.name;

            }
            if (each.salary < minSalary) {
                minSalary = each.salary;
                minname = each.name;
            }
        }

        System.out.println(minname + " minimum salary : " + minSalary);
        System.out.println(maxname + " maximum salary : " + maxSalary);



        for (Employee each:employees){
            System.out.println(each.name+" ======> "+each.jobTitle);
        }
        System.out.println("======================================");

        ArrayList<Employee> list=new ArrayList<>();
        for (Employee each:employees){
            list.add(each);
        }
        System.out.println(list);


        System.out.println("=======================\n\n");

        for (Employee each:list){
            if (each.jobTitle.equalsIgnoreCase("sdet")|| each.jobTitle.equalsIgnoreCase("ba")){
                System.out.println(each);
            }

        }

    }

}
