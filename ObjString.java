import java.util.Objects;

class Laptop
{
    String model;
    int price;


    public String toString()
    {
        return "Laptop{" + "model='" + model + '\'' + ", price=" + price + '}';
    }

    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return price == laptop.price && Objects.equals(model, laptop.model);
    }

    public int hashCode()
    {
        return Objects.hash(model, price);
    }
}


public class ObjString
{
    public static void main(String[] args)
    {
        Laptop obj1 = new Laptop();
        obj1.model = "Lenovo";
        obj1.price = 1500;

        Laptop obj2 = new Laptop();
        obj2.model = "Lenovo";
        obj2.price = 1501;

        boolean result = obj1.equals(obj2);
        System.out.println(result);


    }
}
