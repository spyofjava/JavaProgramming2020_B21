package DailyExercise.Inheritance.Family;

public class MyFamily {

//------------Instance variable --------------//
    public String name,Jobtitle;
    public char  gender;
    public int age;
    long ssn;
    public  boolean school;
//------------------------------------------//



//----------Constructor---------------------//
    public MyFamily(String name, String jobtitle, char gender, int age, long ssn,boolean school) {
        this.name = name;
        Jobtitle = jobtitle;
        this.gender = gender;
        this.age = age;
        this.ssn=ssn;
        this.school=school;
    }

//------------------------------------------//



//------------------Methods-------------------//

public boolean student(){
    return school;
}


    @Override
    public String toString() {
        return "MyFamily{" +
                "name: " + name +
                " Jobtitle: " + Jobtitle  +
                ", gender: " + gender +
                ", age: " + age +
                ", ssn: " + ssn +
                ", school: " + school +
                '}';
    }
}