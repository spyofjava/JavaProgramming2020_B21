package day50_Polymorphism;


import day47_Abstraction.EmployeeTask.Developer;
import day47_Abstraction.EmployeeTask.Employee;
import day47_Abstraction.EmployeeTask.Tester;
import day47_Abstraction.EmployeeTask.UberDriver;

public class AppleInc {

    public static void main(String[] args) {

        Employee[] employees = {
                new Tester("Mini", 23, 'F', "SDET", "S123", 95_000),
                new Developer("Emre", 30, 'M', "Java Developer", "784512", 110000),
                new UberDriver("Mahmood", 54, 'M', "Driver", "UBR123", 75000),
                new Developer("Emre", 30, 'M', "Java Developer", "784512", 110000),
                new Developer("Emre", 30, 'M', "Java Developer", "784512", 110000),
                new Developer("Emre", 30, 'M', "Java Developer", "784512", 110000),
                new Developer("Emre", 30, 'M', "Java Developer", "784512", 110000),
                new Developer("Emre", 30, 'M', "Java Developer", "784512", 110000),
                new Developer("Emre", 30, 'M', "Java Developer", "784512", 110000),
                new Tester("Mini", 23, 'F', "SDET", "S123", 95_000),
                new Tester("Mini", 23, 'F', "SDET", "S123", 95_000),
                new UberDriver("Mahmood", 54, 'M', "Driver", "UBR123", 75000),
                new UberDriver("Mahmood", 54, 'M', "Driver", "UBR123", 75000),
                new UberDriver("Mahmood", 54, 'M', "Driver", "UBR123", 75000),
                new UberDriver("Mahmood", 54, 'M', "Driver", "UBR123", 75000),
                new UberDriver("Mahmood", 54, 'M', "Driver", "UBR123", 75000),
                new UberDriver("Mahmood", 54, 'M', "Driver", "UBR123", 75000),
                new UberDriver("Mahmood", 54, 'M', "Driver", "UBR123", 75000),
                new UberDriver("Mahmood", 54, 'M', "Driver", "UBR123", 75000),
                new UberDriver("Mahmood", 54, 'M', "Driver", "UBR123", 75000),
                new UberDriver("Mahmood", 54, 'M', "Driver", "UBR123", 75000),
                new UberDriver("Mahmood", 54, 'M', "Driver", "UBR123", 75000)

        };


    }
}