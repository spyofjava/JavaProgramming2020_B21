package DailyExercise.Dec_14_StaticBlock;

import day39_StaticBlock.Test;

import java.util.ArrayList;

public class MyTeam {
    public static void main(String[] args) {

        DailyExercise.Dec_14_StaticBlock.Developer developer1 = new DailyExercise.Dec_14_StaticBlock.Developer();
        DailyExercise.Dec_14_StaticBlock.Developer developer2 = new DailyExercise.Dec_14_StaticBlock.Developer();
        DailyExercise.Dec_14_StaticBlock.Developer developer3 = new DailyExercise.Dec_14_StaticBlock.Developer();
        DailyExercise.Dec_14_StaticBlock.Developer developer4 = new DailyExercise.Dec_14_StaticBlock.Developer();

        developer1.setInfo("Bektemir", "K-01", "Full stack Developer", "Amazon", 160000, 'M');
        developer2.setInfo("Nikola", "Y-821", "Software Developer", "Windows", 155000, 'M');
        developer3.setInfo("Meredith", "T-234", "Full stack Developer", "Apple", 140000, 'F');
        developer4.setInfo("Ian", "L-02", "Developer", "CVS Pharmacy", 135000, 'M');


        DailyExercise.Dec_14_StaticBlock.Tester tester1 = new DailyExercise.Dec_14_StaticBlock.Tester();
        DailyExercise.Dec_14_StaticBlock.Tester tester2 = new DailyExercise.Dec_14_StaticBlock.Tester();
        DailyExercise.Dec_14_StaticBlock.Tester tester3 = new DailyExercise.Dec_14_StaticBlock.Tester();
        tester1.setInfo("Adnan","0005","Tester","Cybertek",98000,'M');
        tester2.setInfo("Dean","0006","Tester","Cybertek",98500,'M');
        tester3.setInfo("Jair","0007","Tester","Cybertek",99000,'M');

        Tester [] testers={tester2,tester3};
        Developer[] developers={developer1,developer2,developer3,developer4};

        ScrumTeam scrum1 =new ScrumTeam();
        scrum1.setInfo("Yalcin", "Bektemir", "Elvira");
        scrum1.addTester(tester1);
        scrum1.addTester(testers);
        scrum1.addDeveloper(developers);

        System.out.println(scrum1);


    }
}
