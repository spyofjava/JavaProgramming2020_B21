package day50_Polymorphism.PhoneTask;

public final class Samsung extends Phone implements AndroidApps {
    public Samsung(String brand, String model, String size, String color, double price) {
        super(brand, model, size, color, price);
        if (price>1200){
            throw new RuntimeException("Invalid Price, Samsung' price cannot more than 1200");
        }
    }

    @Override
    public void downloadApp() {

    }

    @Override
    public void text() {

    }

    @Override
    public void call() {

    }
}
/*
6. create a class named Samsung that can inherit from AndroidApps and Phone
            actions: texting(), calling(), freezing()
             if the price of Samsung is more than 1200, the system should throw an exception with a message of:
                    Invalid Price, Samsung' price cannot more than 1200
 */