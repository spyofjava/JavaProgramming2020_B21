package day43_Inheritance.calisma;

public class  hayvanlar  {
    public String name;
            String eat;

    public hayvanlar(String name, String  eat) {
        this.name = name;
        this.eat = eat;
    }


    @Override
    public String toString() {
        return "hayvanlar{" +
                "name='" + name + '\'' +
                ", eat='" + eat + '\'' +
                '}';
    }



}
