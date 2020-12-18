package day43_Inheritance.WarmUpTask;

public class Employee extends Person{
    /*
    inherited:
        variables : name, age, gender
        methods: setInfo, eat, sleep, toSting
     */

    public double hourlyrate;
    public String jobTitle,ID;

    public void work(){
        System.out.println(name+" is working");
    }

    public void setInfo(String name,int age,char gender, double hourlyrate,String jobTitle,String ID){
        setInfo(name,age,gender);
        this.hourlyrate=hourlyrate;
        this.ID=ID;
        this.jobTitle=jobTitle;
    }

    @Override
    public String toString() {
        return "Employee{" +
                ", name='" + name + '\'' +
                ", age=" + age +
                "hourlyrate=" + hourlyrate +
                ", jobTitle='" + jobTitle + '\'' +
                ", ID='" + ID + '\'' +
                ", gender=" + gender +
                '}';
    }
}
/*
Employee extends Person:
        name, age, gender, hourlyRate, jobTitle, ID
        setInfo, eat(), sleep(), work()

 */