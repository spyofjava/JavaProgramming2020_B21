package DailyExercise.Dec_14_StaticBlock;

public class Carpet {
    public double width,length,unitPrice;
    public boolean ispersian;

    public void setInfo(double width,double length,double unitPrice,boolean ispersian){
        this.width=width;
        this.length=length;
        this.unitPrice=unitPrice;
        this.ispersian=ispersian;
    }

    public double calcCost(){

        double totalPrice=(width*length)*unitPrice;
        if (ispersian=true){
            totalPrice+=200;
        }
        return totalPrice;
    }


    @Override
    public String toString() {

        return  "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", ispersian=" + ispersian +
                " Total Price= $"+calcCost()+
                '}';
    }
}
