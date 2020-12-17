package day39_StaticBlock;

import static library.StringUtility.reverse;

public class StaticBlocks2 {

    public static void main(String[] args) {

        System.out.println("Main Method");


    }

    static{
        System.out.println("Static Block 1");

    }

    static{
        System.out.println("Static block 2");
    }

    static{
        System.out.println("Static block 3");
    }


}
