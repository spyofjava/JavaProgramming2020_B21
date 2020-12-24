package day41_Encapsulation;

import java.util.ArrayList;
import java.util.Arrays;
///////////////////////////////////////  ----  1  ----  /////////////////////////
public class ShoppingList_1 {
    public static void main(String[] args) {

        ArrayList<Item_1> items = new ArrayList<>();
        items.addAll(Arrays.asList(
                new Item_1("sanitizer", 15, 30),
                new Item_1("mask", 10, 225),
                new Item_1("Watermelon",  2,2.24),
                new Item_1("toilet paper", 20, 50),
                new Item_1("sanitizer", 15, 30),
                new Item_1("mask", 10, 225)
        ) );

        System.out.println(items);

        double total = 0;
        for(Item_1 eachItem  : items ){
            total += eachItem.calcCost();
        }

        System.out.println("total = " + total);


    }
}
