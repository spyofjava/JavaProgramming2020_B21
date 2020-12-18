package DailyExercise.MethodsReview;

import java.util.ArrayList;
import java.util.Arrays;

public class empty {

    public static void main(String[] args) {

        ArrayList<String >n=new ArrayList<>();
        n.addAll(Arrays.asList("ali","ayse","osman","osman"));

        System.out.println(n.contains("a"));//false
        System.out.println(n.get(0));//ali
        System.out.println(n.get(1));//ayse
        System.out.println(n.indexOf("ali"));
        System.out.println(n.lastIndexOf("osman"));
        System.out.println(n.indexOf("osman"));




    }


}
