package DailyExercise.Dec_14_StaticBlock.DevTeam;

public class Developer {
    public String name, jobTitle;
    public double salary;


    public void setInfo(String name, String ID, String jobTitle, String companyName, double salary, char gender) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return  name;
    }
}
