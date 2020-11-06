package Day27_ForEachLoop;

import java.util.Arrays;

public class CombineThreeArrays {
    public static void main(String[] args) {


        String[] group1={"Sara","Jesicca", "Parker", "Dragisa","Sladjan"};
        String[] group2={"Jamel","Bonda", "Indiana", "Jones","Max","Payne"};
        String[] group3={"Abdul","sacha", "amin", "salih","jessica"};
        String[] group4={"Madison","Aliya", "Saga"};
        String[] groups=new String[group1.length+group2.length+group3.length+group4.length];
        int i=0;

        for (String each: group1){
            groups[i++]=each;
        }
        for (String each: group2){
            groups[i++]=each;
        }
        for (String each: group3){
            groups[i++]=each;
        }
        for (String each: group4){
            groups[i++]=each;
        }
        System.out.println(Arrays.toString(groups));
    }
}
