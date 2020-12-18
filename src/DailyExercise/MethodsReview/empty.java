package DailyExercise.MethodsReview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class empty {

    public static void main(String[] args) {

        ArrayList<String >n=new ArrayList<>();
        n.addAll(Arrays.asList("ali","ayse","osman","osman"));

        System.out.println(n.contains("a"));//false
        System.out.println(n.get(0));//ali
        System.out.println(n.get(1));//ayse
        System.out.println(n.indexOf("ali"));//0
        System.out.println(n.lastIndexOf("osman"));//3
        System.out.println(n.indexOf("osman"));//2
        n.removeAll(Arrays.asList("osman"));
        System.out.println(n);//ali,ayse
        n.retainAll(Arrays.asList("osman"));
        System.out.println(n);//[]
        n.addAll(Arrays.asList("ali","ayse","osman","osman"));//ali,ayse,osman,osman
        n.removeIf(p->p.contains("ayse"));//ali,osman,osman
        System.out.println(n);
        n.remove(2);//ali,osman
        System.out.println(n);
        String a=n.toString().replace("[", "").replace("]","").replace(",", "");
        System.out.println(a);
        n.addAll(Arrays.asList("ali","ayse","osman","osman"));
        System.out.println(n);
        Collections.replaceAll(n,"ali","kamil");
        System.out.println(n);
        ArrayList<Integer> num=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        int max=Collections.max(num);
        System.out.println(max);
        int min=Collections.min(num);//9
        System.out.println(min);//1
        System.out.println(n.isEmpty());//false
        System.out.println(!n.isEmpty());//true

        ArrayList<Integer> scores = new ArrayList<>();
        scores.addAll( Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18, 19, 20) );

       // scores.removeIf(p->p%3==0 && p%5==0);//it means %15==0
        //scores.removeIf(p->p%3==0 || p%5==0);
        //scores.removeIf(p->p%3==0 && p%5!=0);
        //scores.removeIf(p->!(p%3==0 && p%5==0));//it is same with retainall method
        scores.retainAll(Arrays.asList(15));


        System.out.println(scores);





    }


}
