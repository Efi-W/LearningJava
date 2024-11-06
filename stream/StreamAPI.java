package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

class Components{     //For Stream filter
    String name;
    int price;

    public Components(String n, int p){ //For Stream filter
        this.name = n;
        this.price = p;

    }
}


public class StreamAPI {
    public static void main(String[] args) {

       //Creating a Stream (String)
       Stream<String> cars = Stream.of("Nissan", "Honda", "Toyota"); //Create StreamOf Strings
       cars.forEach(System.out::println);

       //Creating a Stream(Integer)
       Stream<Integer> ints = Stream.of(19,17,16,21); //Create StreamOf Ints
       ints.forEach(System.out::println);


       //Creating Stream using list
        List<String> engines = Arrays.asList("V8", "V9", "V10");  //Create Array as a List
        Stream<String> strEngines = engines.stream(); //Create new stream of engines
        strEngines.forEach(System.out::println); //For each string in engine, print them.


        //Using filter
        ArrayList<Components> list = new ArrayList<>(); //Create new Array List
        List<Components> list2 = new LinkedList<>(); //Create new Array List

        list.add(new Components("Wheel", 1500)); //Add to ArrayList
        list.add(new Components("Tire", 300));
        list.add(new Components("Rim", 2000));

        Stream<Components> newComp = list.stream().filter(s -> s.price < 1000); //Create new stream of Arraylist & filter so price is < 1000
        newComp.forEach( Components -> System.out.println(Components.name)); //For each Component, print names of ones less than price 1000

        //Creating a Stream Map
        List<String> lang = Arrays.asList("eng", "jap", "grk"); //Create Array as List
        lang.stream().map(String::toUpperCase).forEach(System.out::println); //Convert List into stream and map it, convert strings to uppercase then for each string, print them.


    }
}
