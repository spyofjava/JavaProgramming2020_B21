package day29_Methods;

import java.util.Arrays;
import java.util.Scanner;

public class AddElements {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int [] numbers={12,56,54,988,953,48};
        System.out.println("Which number do you want to add?: ");
        int add=scanner.nextInt();
        addelement(numbers,add);
    }

    public static void addelement(int[] numbers,int add){
        int[] addednumbers=new int[numbers.length+1];
        for (int i=0;i< numbers.length;i++){
            addednumbers[i]=numbers[i];
        }
        addednumbers[addednumbers.length-1]=add;
        System.out.println(Arrays.toString(addednumbers));
    }





}
