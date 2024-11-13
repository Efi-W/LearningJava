package Enum;


enum TrafficLight{

    RED, AMBER, GREEN
}
//enum


public class Enum {
    public static void main(String[] args) {

   TrafficLight red = TrafficLight.RED;
   TrafficLight amber = TrafficLight.AMBER;
   TrafficLight green = TrafficLight.GREEN;


   switch(amber){  //Switch for amber

       case RED -> {
           System.out.println("Stop");
           break;
       }

       case AMBER -> {
           System.out.println("Get Ready");
           break;
       }

       case GREEN ->{
           System.out.println("Go");
           break;
       }
       default -> System.out.println("Not found");

   }

   TrafficLight[] Status = TrafficLight.values();  //Print all values (needs to be array)

   for(TrafficLight s : Status){  //foreach
       System.out.println(s + " " + s.ordinal()); //print all and indexes

   }

    }
}
