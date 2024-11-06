package collections;

import java.util.ArrayList;
import java.util.Collections;

class Vehicles implements Comparable
    //Implement Comparable
{
    public String name;
    public String model;
    public int year;

    //Create Class Car with attributes name,model,year.


    public Vehicles(String n, String m, int y) {
        name = n;
        model = m;
        year = y;
    }
    //Create Constructor with n,m,y where Name, Model, Year are represented as n, m, y.

    public int compareTo(Object obj){
        Vehicles other = (Vehicles) obj;

        if (year < other.year){
            return -1;
            //Return -1 if the first car has a smaller year (Don't sort)
        }
        if (year > other.year){
            return 1;
            //Return 1 if the first car has a bigger year (Will Swap)
        }
        else{
            return 0;
            //Return 0 if the years are the same, do nothing.
        }
    }
}


public class Comparables {
    public static void main(String[] args) {

        ArrayList<Vehicles> veh = new ArrayList<>();
        //Create new ArrayList of Cars

        veh.add(new Vehicles("Ford", "Fiesta", 2010));
        veh.add(new Vehicles("Dodge", "Challenger", 2015));
        veh.add(new Vehicles("Mazda", "Miata", 1989));

        //Add new Cars to the ArrayList

        Collections.sort(veh);

        for(Vehicles v : veh){
            System.out.println(v.name + " " + v.model + " " + v.year);
        }
    }
}
