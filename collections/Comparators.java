package collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Car{
    public String name;
    public String model;
    public int year;

    //Create Class Car with attributes name,model,year.


    public Car(String n, String m, int y) {
        name = n;
        model = m;
        year = y;
    }
    //Create Constructor with n,m,y where Name, Model, Year are represented as n, m, y.

}


//Create Comparators
class SortCars implements Comparator {
    public int compare(Object obj1, Object obj2)
    {
        Car a = (Car) obj1;
        Car b = (Car) obj2;

        //Car a and b are obj1 and obj2.

        if (a.year < b.year){
            return -1;
            //Return -1 if the first car has a smaller year (Don't sort)
        }
        if (a.year > b.year){
            return 1;
            //Return 1 if the first car has a bigger year (Will Swap)
        }
        else{
            return 0;
            //Return 0 if the years are the same, do nothing.
        }
    }
}


public class Comparators {
    public static void main(String[] args)
    {
        ArrayList<Car> cars = new ArrayList<>();
        //Create new ArrayList of Cars

        cars.add(new Car("Honda", "Civic", 2009));
        cars.add(new Car("Nissan", "GTR", 1999));
        cars.add(new Car("Toyota", "GT-86", 2017));

        //Add new Cars to the ArrayList


        Comparator comp = new SortCars();
        //Create Comparators
        Collections.sort(cars, comp);
        //Sort the cars


        for (Car c : cars){
            //Print each sorted Car + attributes
            System.out.println(c.name + " " + c.model + " " + c.year);
            //Output format
        }

    }


}
