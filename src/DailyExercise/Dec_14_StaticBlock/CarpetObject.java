package DailyExercise.Dec_14_StaticBlock;


import java.util.ArrayList;
import java.util.Arrays;

public class CarpetObject {

    public static void main(String[] args) {

        Carpet[] carpets = {new Carpet(),new Carpet(),new Carpet(),new Carpet(),new Carpet()};
        carpets[0].setInfo(5, 7, 15, false);
        carpets[1].setInfo(5, 7, 15, true);
        carpets[2].setInfo(8, 10, 12, false);
        carpets[3].setInfo(10, 15, 13, true);
        carpets[4].setInfo(15, 20, 20, true);

        ArrayList<Carpet> list=new ArrayList<>();
        list.addAll(Arrays.asList(carpets));
        System.out.println(Arrays.asList(carpets));




    }



}
