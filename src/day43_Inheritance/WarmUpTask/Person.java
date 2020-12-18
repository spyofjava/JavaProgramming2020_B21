package day43_Inheritance.WarmUpTask;

public class Person {  // this is a super class

    public String name;
    public int age;
    public char gender;

    public void setInfo(String name,int age,char gender){// right click->constractor->change name as void setInfo
        this.name=name;
        this.age=age;
        this.gender=gender;
    }

    public void eat(){
        System.out.print(name+" is eating" );
    }

    public void sleep(){
        System.out.println(name+" is sleeping");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
/*
Person
        name, age, gender
        setInfo, eat(), sleep()

 */
