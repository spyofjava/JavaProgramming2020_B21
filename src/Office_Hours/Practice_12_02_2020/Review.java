package Office_Hours.Practice_12_02_2020;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Review {

    public static void main(String[] args) {


        ArrayList<Integer> list1=new ArrayList<>();
        list1.addAll(Arrays.asList(1,2,3,4,5,6,7,7,7,7,7,8,8,8,8,9,9,9,9,9));

        ArrayList<Integer> list2=new ArrayList<>(Arrays.asList(10,10,10,10,12,12,12,13,13,14,15,15,15));

        list1.addAll(list2);
        System.out.println(list1);
        //System.out.println(list2);


        list1.removeIf(p->  Collections.frequency(list1,p)>1);

        System.out.println(list1);

        Collections.replaceAll(list2,10,1);
        System.out.println(list2);
        list2.removeIf(p->Collections.frequency(list2,p)>1);
        System.out.println(list2);
        list2.addAll(Arrays.asList(1,2,3,4,5,6,7,7,7,7,7,8,8,8,8,9,9,9,9,9));
        System.out.println(list2);
        Collections.swap(list2,list2.size()-1,0);
        System.out.println(list2);
        list2.add(0,10);
        System.out.println(list2);
        list2.add(0,11);
        System.out.println(list2);
        list2.add(0,12);
        System.out.println(list2);

        System.out.println("=============================\n\n");
            //0 1 1 2 3 5 8 13 21
        ArrayList<Integer> fibonacci=new ArrayList<>(Arrays.asList(0,1));
        for (int i=2;i<30;i++){
            int add=fibonacci.get(i-2)+fibonacci.get(i-1);
            fibonacci.add(add);
        }
        //fibonacci.removeIf(p->p>10);
        System.out.println(fibonacci);






    }
}
