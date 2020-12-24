package day41_Encapsulation;
///////////////////////////////////////  ----  4  ----  /////////////////////////
import java.time.LocalDate;

public class PersonObject_4 {

    public static void main(String[] args) {

        Person_4 p1 = new Person_4("Jimmy", 19, 'M', LocalDate.of(2001,5,6));
        // System.out.println(p1.name);
        System.out.println( p1.getName() );

        p1.setName("Breanna");
        // p1.setGender('F');
        p1.setAge(23);

        System.out.println( p1.getName() );
        System.out.println( p1.getGender());
        System.out.println( p1.getAge() );


        //      Person p2 = new Person("Breanna", 23, 'F');


    }
}
