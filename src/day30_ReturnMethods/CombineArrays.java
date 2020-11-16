package day30_ReturnMethods;

import java.util.Arrays;

public class CombineArrays {
    public static void main(String[] args) {

        int [] numbers1={1,2,3,4};//l=4
        int []numbers2={5,6,7,8,9};//l=5
        CombineArrays(numbers1,numbers2);
        System.out.println("===========================\n");
        FormatFullName("CyBerTeK","SChOoL");

    }
    public static void CombineArrays(int[] numbers1,int []numbers2){




/*
        int[] newNum=new int [numbers1.length+ numbers2.length];//l=9
        for (int i=0;i< numbers1.length;i++){//i=0,1,2,3
            newNum[i]=numbers1[i];

        }
        for (int j= numbers1.length,i=0;j<newNum.length;i++,j++){
            newNum[j]=numbers2[i];
        }

        System.out.println(Arrays.toString(newNum));
*/


    }



    public static void FormatFullName(String first,String last){
        first=first.substring(0,1).toUpperCase()+first.substring(1).toLowerCase();
        last=last.substring(0,1).toUpperCase()+last.substring(1).toLowerCase();
        String fullName=first+" "+last;
        System.out.println(fullName);
    }


}
