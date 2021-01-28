package Office_Hours.Practice_01_27_2021;

import day42_Inheritance.AnimalTask.Animal;
import day42_Inheritance.AnimalTask.Cat;
import day45_Exceptions.PhoneTask.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PracticeMyself {

    public static void main(String[] args) {

        Phone [] phones = {
                new Iphone("12 pro", 1100),  new Samsung("S20", 1000)
                , new Nokia("N95", 200), new HuaWei("meta 40", 100),
                new HuaWei("nova 7", 100),new Iphone("11 pro", 1100),
                new Iphone("12 pro", 1100), new Iphone("12 pro", 1100),
                new Samsung("S20", 1000), new Samsung("S20", 1000),
                new Samsung("S20", 1000),new Nokia("N95", 200),
                new Nokia("N95", 200), new Iphone("12 pro", 1100),
                new Samsung("S20", 1000), new Nokia("N95", 200),
                new Nokia("N95", 200), new Nokia("N95", 200),
                new Nokia("N95", 200), new Iphone("11 pro", 1100),
                new Iphone("12 pro", 1100), new Iphone("12 pro", 1100)
        };

        int countIphone=0;
        int countNokia=0;
        int countSamsung=0;
        int countHuaWei=0;

        for (Phone each:phones) {
            if (each instanceof Iphone) {
                countIphone++;
            } else if (each instanceof Samsung) {
                countSamsung++;
            } else if (each instanceof Nokia) {
                countNokia++;
            } else if (each instanceof HuaWei) {
                countHuaWei++;
            }
        }
            System.out.println("countIphone = " + countIphone);
            System.out.println("countSamsung = " + countSamsung);
            System.out.println("countHuaWei = " + countHuaWei);
            System.out.println("countNokia = " + countNokia);

        Animal animal=new Cat("alvin","breed",'F',2,"gray","small");

        System.out.println(animal instanceof Cat);

        System.out.println(animal.age);
        System.out.println(animal.toString());

    }

}
