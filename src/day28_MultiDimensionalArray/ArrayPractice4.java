package day28_MultiDimensionalArray;

public class ArrayPractice4 {
    public static void main(String[] args) {

        String[] employeeNames = {"Asel", "Afrooz", "Safa" , "Suveyda", "Rinat"};
        int[] employeeSalary = {1000000, 110000, 1000000, 120000, 125000};

        int max=employeeSalary[0];
        for (int each:employeeSalary){
            if (each>max){
                max=each;
            }
        }
        System.out.println("Max: "+max);
        for (int i=0;i<employeeNames.length;i++){
            if (max==employeeSalary[i]){
                System.out.println(employeeNames[i]);
            }
        }
    }
}
