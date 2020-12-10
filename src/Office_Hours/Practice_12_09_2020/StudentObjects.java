package Office_Hours.Practice_12_09_2020;

public class StudentObjects {

    public static void main(String[] args) {


        CybertekStudents student1 = new CybertekStudents();
        student1.setInfo("Edrees", 25, 'M');
        student1.schoolName = "MIT";
        System.out.println(student1);

        CybertekStudents student2 = new CybertekStudents();
        student2.setInfo("Liubov", 24, 'F');

        System.out.println(student2);
    }
}
