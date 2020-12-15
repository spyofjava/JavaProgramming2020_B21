package DailyExercise.Dec_14_StaticBlock;

import day39_StaticBlock.Test;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {

    public String PO, BA, SM;
    public ArrayList<Tester> testersTeam=new ArrayList<>();
    public ArrayList<Developer> developersTeam=new ArrayList<>();


    public void setInfo(String PO,String BA,String SM) {
        this.PO=PO;
        this.BA=BA;
        this.SM=SM;
    }

    public void addTester(Tester tester){
        testersTeam.add(tester);
    }
    public void addTester(Tester[] tester){
        testersTeam.addAll(Arrays.asList(tester));
    }
    public void removeTester(String ID){
        testersTeam.removeIf(p->p.ID.equalsIgnoreCase(ID));
    }

    public void addDeveloper(Developer developer){
        developersTeam.add(developer);
    }

    public void addDeveloper(Developer[] developer){
        developersTeam.addAll(Arrays.asList(developer));
    }
    public void removeDeveloper(String ID){
        testersTeam.removeIf(p->p.ID.equalsIgnoreCase(ID));
    }


    @Override
    public String toString() {
        return  "PO='" + PO +
                ", BA='" + BA +
                ", SM='" + SM +
                ", Total number of Testers= " + testersTeam.size() +
                ", Total number of Developers=" + developersTeam.size() +
                '}';
    }
}
