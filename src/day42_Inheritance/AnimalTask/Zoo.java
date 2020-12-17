package day42_Inheritance.AnimalTask;

public class Zoo  {

    public static void main(String[] args) {

        Tiger tiger = new Tiger("Sher Khan","bengal tiger" ,'M',5,"Orange" ,"large");
        System.out.println(tiger);
        tiger.eat("chicken");
        //tiger.meow();
        //tiger.bark();
        tiger.roar();
        tiger.hunt();

        Cat cat = new Cat("Kitty","British fold",'F',1,"White","Small");
        System.out.println(cat);
        cat.meow();
        cat.eat("tuna");
        cat.drink("milk");
        cat.sleep();

        Dog dog = new Dog("Nina","American bull dog",'F',2,"White and brown","Big");
        System.out.println(dog);
        dog.eat("chicken");
        dog.drink("water");
        dog.sleep();
        dog.bark();



    }
}
