package day41_Encapsulation;
///////////////////////////////////////  ----  1  ----  /////////////////////////
public class Item {

    public String name;
    public int quantity;
    public double unitPrice;

    public Item(String name, int quantity, double unitPrice) {
        this.name = name;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public double calcCost(){
        return quantity * unitPrice;
    }

    public String toString() {
        return "Item{" +
                "name ='" + name + '\'' +
                ", quantity = " + quantity +
                ", unitPrice = $" + unitPrice +
                ", total price= $" + calcCost()+
                '}';
    }




}
