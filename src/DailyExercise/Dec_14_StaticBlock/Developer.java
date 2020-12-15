package DailyExercise.Dec_14_StaticBlock;

public class Developer {

    public String name, ID, jobTitle, companyName;
    public double salary;
    public char gender;

    public static boolean hasCodingSkills=true;

    public void setInfo(String name,String ID,String jobTitle,String companyName,double salary,char gender){
        this.name=name;
        this.ID=ID;
        this.jobTitle=jobTitle;
        this.companyName=companyName;
        this.salary=salary;
        this.gender=gender;
    }



    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", ID='" + ID + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", companyName='" + companyName + '\'' +
                ", salary=" + salary +
                ", gender=" + gender +
                '}';
    }
}
