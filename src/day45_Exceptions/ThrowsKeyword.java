package day45_Exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.NoSuchElementException;

public class ThrowsKeyword {

    public static void main(String[] args) throws Exception{


        /*try {
            Thread.sleep(3000);
        }catch (){
            System.out.println();
        }*/

        Thread.sleep(3000);
        System.out.println("Cybertek".charAt(500));
        System.out.println("Step 2");



    }
}
