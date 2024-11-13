package Enum;

enum Car{
    NISSAN(25000), FERRARI, TOYOTA(45000), HONDA(30000); //constants

    private int price; //variable

    private Car(){
        this.price = 1200000; //default constructor

    }
    private Car(int price){
        this.price = price;    //parameterised constructor
    }

    public int getPrice() {
        return price;      //getter
    }

    public void setPrice(int price) {
        this.price = price;   //setter
    }
}


public class EnumClass {
    public static void main(String[] args) {

        for(Car c : Car.values()){ //for each value in Car
            System.out.println(c + ": £" + c.getPrice()); //print name and price
        }

    }
}

