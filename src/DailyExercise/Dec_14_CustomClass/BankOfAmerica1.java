package DailyExercise.Dec_14_CustomClass;

public class BankOfAmerica1 {

    public static void main(String[] args) {

        Empoyee1 emp1=new Empoyee1();

        emp1.setInfo("Ayse", "Bank Of America", "QA", "ABC123", "Female", 45, 55);
        System.out.println(emp1);


        System.out.println("Total Tax: " +emp1.calculateTax(0.05,0.22));
        System.out.println("Salary After Tax: " +(emp1.calculateSalary()-emp1.calculateTax(0.05,0.22)));
        System.out.println();
    }
}
