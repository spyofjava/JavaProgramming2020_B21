package DailyExercise.Dec_14_StaticBlock.DevTeam;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {

    public String PO,SM,BA;
    public ArrayList<Tester> testerTeam=new ArrayList<>();
    public ArrayList<Developer> developerTeam=new ArrayList<>();

    public void setInfo(String PO, String BA, String SM){
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
    }

    public void addTester(Tester tester){
        testerTeam.add(tester);
    }

    public void addTester(Tester[] tester){
        testerTeam.addAll(Arrays.asList(tester));
    }

    public void addDeveloper(Developer developer){
        developerTeam.add(developer);
    }

    public void addDeveloper(Developer[] developer){
        developerTeam.addAll(Arrays.asList(developer));
    }



    public String toString() {
        return "ScrumTeam{" +
                "PO='" + PO + '\'' +
                ", SM='" + SM + '\'' +
                ", BA='" + BA + '\'' +
                ", testerTeam=" + testerTeam +
                ", developerTeam=" + developerTeam +
                '}';
    }
}
