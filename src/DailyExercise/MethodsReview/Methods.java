package DailyExercise.MethodsReview;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Methods {

/*
    public static void main(String[] args) {

        reverseMyName();

        String []names={"ali","ayse","osman"};
        reverseMyname(names);


        ArrayList<String >n=new ArrayList<>();
        n.addAll(Arrays.asList("ali","ayse","osman"));
        reverseMyname(n);

    }

 */




    public static void reverseMyName(){

        String name="Ibrahim";
        String result="";
        for (int i=name.length()-1;i>=0;i--){
            System.out.print(name.charAt(i)+" ");
        }
    }

    public static void reverseMyname(String[] names){

        String[] result=new String[names.length];
        for (int i=names.length-1;i>=0;i--){
            System.out.print(names[i]+" ");
        }


        for (String each:names){
            for (int i=each.length()-1;i>=0;i--){
                System.out.print(each.charAt(i));
            }
            System.out.print(" ");
        }



    }

    public  static void  reverseMyname(ArrayList<String> names){


        for (String each:names){
            for (int i=each.length()-1;i>=0;i--){
                System.out.print(each.charAt(i)+"");
            }
            System.out.print(" ");
        }
    }




}
