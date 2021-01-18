package DailyExercise;

import java.util.stream.Stream;

public class Book {

    int pages;
    static  String author;

    static {
        author="stephen king";
    }

    public void  set(int pages){
        this.pages=pages;

    }

    public static void main(String[] args) {

        author="veli";

        Book b1=new Book();
        b1.set(500);
        //b1.author="Christopher";
        Book b2=new Book();


        System.out.println(b1.author);

    }

}

