package day43_Inheritance.WarmUpTask;

public class Tester extends Employee{
    /*
    inherited:
        variables : name, age, gender, hourlyRate, jobTitle, ID
        methods: setInfo, eat, sleep, toSting
     */

    public void eat(){
        System.out.println(name+" is eating");
    }

    public  void sleep(){
        System.out.println(name+" is sleeping");
    }

    public void work(){
        System.out.println(name+" is working");
    }

    public void testing(){
        System.out.println(name+" is testing");
    }

    public void setInfo(String name,int age, char gender, double hourlyRate, String jobTitle, String ID){
       setInfo(name,age,gender,hourlyRate,jobTitle,ID);

   }


}
/*

Tester extends Employee:
        name, age, gender, hourlyRate, jobTitle, ID
        Constructor
        eat(), sleep(), work(), testing(),...
 */