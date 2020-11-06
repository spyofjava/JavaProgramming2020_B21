package day25_ArrayIntro;

public class MaxMin {
    public static void main(String[] args) {

        int num[]={100,21,13,41,50,65,755,81};
        int max=num[0];
        for (int i=0;i<num.length;i++){
            if (num[i]>max) {
                max = num[i];
            }
        }


        int min=num[0];
        for (int j=0;j<num.length;j++) {
            if (min > num[j]) {
                min = num[j];
            }
        }
        System.out.println("Max number: "+max);
        System.out.println("Min number is: "+min);


    }
}
