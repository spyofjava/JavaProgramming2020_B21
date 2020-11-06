package day28_MultiDimensionalArray;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {

        /*
        ScrumTeam
            Testers:{"Dorin", "Adil", "Fatih", "Subhi"}
            Developers:{"Kastrinsi", "Mustafa", "Ruslan"}
            SM:{"Ayse"}
            PO:{"Omid"}
            BA:{"Agalar"}

         */

        String [][] scrumTeam={
                             {"Dorin", "Adil", "Fatih", "Subhi"},//0
                             {"Kastrinsi", "Mustafa", "Ruslan"},//1
                             {"Ayse"},                          //2
                             {"Omid"},                          //3
                             {"Agalar"}                         //4
                    };

        System.out.println(Arrays.deepToString(scrumTeam));
        for (int i=0;i<scrumTeam.length;i++){
            System.out.println(Arrays.toString(scrumTeam[i]));
            for (int j=0;j<scrumTeam[i].length;j++){
                System.out.println(scrumTeam[i][j]);
            }
        }



    }
}
