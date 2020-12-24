package day41_Encapsulation;
///////////////////////////////////////  ----  1  ----  /////////////////////////
public class Item_1 {

    public String name;
    public int quantity;
    public double unitPrice;

    public Item_1(String name, int quantity, double unitPrice) {
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
