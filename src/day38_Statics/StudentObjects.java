package day38_Statics;

public class StudentObjects {

    public static void main(String[] args) {

        CybertekSdudent student1 = new CybertekSdudent();

        student1.setInfo("Ayse",21,5,'F');
        student1.study();

        CybertekSdudent student2 = new CybertekSdudent();

        student2.setInfo("Erjon",22,6,'M');

//        System.out.println(student1.schoolName);
//        System.out.println(student2.schoolName);

        System.out.println(CybertekSdudent.schoolName);//prefered

        CybertekSdudent student3 = new CybertekSdudent();
        student3.setInfo("Afrooz",23,7,'M');
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);

        student1.getSchoolInfo();// not prefer
        student2.getSchoolInfo();// not prefer
        student3.getSchoolInfo();// not prefer

        CybertekSdudent.getSchoolInfo();












    }





}
