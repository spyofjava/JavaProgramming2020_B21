package Office_Hours.Practice_01_27_2021;

import java.util.ArrayList;
import java.util.Arrays;

class Fibonacci {

    public  static ArrayList<Integer> howmanyTerm(int num){
        int newNum =0;

        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        if (num==1) {
            return (list);
        }
        list.add(1);
        if(num==2) {
            return (list);
        }

            for (int j = 1; j <= num; j++) {

                newNum=list.get(j-1)+list.get(j);
                list.add(newNum);
                if (num==j+2){
                    return list;
                }
            }
            return list;



    }

}
