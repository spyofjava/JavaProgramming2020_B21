package day17_Strings;
import javax.sound.midi.Soundbank;
import java.lang.String;//this package is already automatically
public class StringMemory {
    public static void main(String[] args) {

        /*
        String pool:
        StrOne---->            "java"           <-----dtrTwo

                              Heap:
                                 "java"            <------strThree
                                   "java"            <-------strFour
         */



        String strOne="java";//literal
        String strTwo="java";//literal
        String strThree=new String("java");//don't type original
        String strFour=new String("java");
        System.out.println(strOne==strTwo);//true
        System.out.println(strOne==strThree);//false
        System.out.println(strThree==strFour);//false
        String strFive=new String("java");

        System.out.println(strOne==strFive);//
    }
}
