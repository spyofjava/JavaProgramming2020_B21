package DailyExercise.MultiDimentionalArrays;

import java.util.Arrays;

public class multidimentional {
    public static void main(String[] args) {


        String[][] batch21 = {
                {"Lily","Lana","Igor"} ,   //0

                {"Polina", "Serhii", "Abdujilil", "Aziz", "Halzat" } ,  //1

                {"Justyna", "Adil","Ercan","Irina","Med", "Olesea","Vlad","Asuman","Guvanch"},//2

        };


        for (int i=0;i<batch21.length;i++){
            System.out.println(Arrays.toString(batch21[i]));
            for (int j=batch21[i].length-1;j>=0;j--){
                System.out.println(batch21[i][j]);
            }
        }




        for (int i=0;i<batch21.length;i++){
            System.out.println(Arrays.toString(batch21[i]));
            for (int j=batch21[i].length-1;j>=0;j--){
                for (int k=batch21[i][j].length()-1;k>=0;k--){
                    System.out.print(batch21[i][j].charAt(k));
                }
                System.out.println();

            }
        }


    }
}
