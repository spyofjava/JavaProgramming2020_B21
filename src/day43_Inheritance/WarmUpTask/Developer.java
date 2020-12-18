package day43_Inheritance.WarmUpTask;

public class Developer extends Employee {
/*
    inherited:
        variables : name, age, gender, hourlyRate, jobTitle, ID
        methods: setInfo, eat, sleep, toSting
     */


    public void eat(){
        System.out.print(name+" is eating" );
    }

    public void sleep(){
        System.out.println(name+" is sleeping");
    }

    public void work(){
        System.out.println(name+" is working");
    }

    public void code() {
        System.out.println(name+" is coding");
    }


    public void setInfo(String name,int age, char gender, double hourlyRate, String jobTitle, String ID){
        setInfo(name,age,gender,hourlyRate,jobTitle,ID);

    }

}
/*
Developer extends Employee:
        name, age, gender, hourlyRate, jobTitle, ID
        Constructor
        eat(), sleep(), work(), code()...


 */