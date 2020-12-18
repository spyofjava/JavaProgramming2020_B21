package day43_Inheritance.WarmUpTask;

public class main {
    public static void main(String[] args) {

        Person person1=new Person();
        person1.setInfo("ali", 32,'M');
        System.out.println(person1);

        Employee p2=new Employee();
        p2.setInfo("ahmet",30,'M',55,"SDET","A210");
        System.out.println(p2);

    }
}
