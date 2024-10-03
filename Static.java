class Mobile
{

    String brand;
    int price;
    static String name;
}


public class Static

{
    public static void main(String[] args)
    {
        Mobile obj1 = new Mobile();
        obj1.brand = "Android";
        obj1.price = 1250;
        Mobile.name = "Smartphone";

        Mobile obj2 = new Mobile();
        obj2.brand = "Apple";
        obj2.price  = 2000;
        Mobile.name = "Iphone";

        Mobile.name = "Phone";

        System.out.println(Mobile.name + " : " + obj1.brand + " : " + obj1.price);




    }
}



