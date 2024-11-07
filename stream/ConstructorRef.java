package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Car{
    private String name;
    private int year;

    public Car(){
        //Default Constructor
    }

    public Car(String name){
        this.name = name;
        //Single parameterized constructor
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    //Getters & Setters

    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
    //ToString method
}

public class ConstructorRef {
    public static void main(String[] args) {


        List<String> carNames = Arrays.asList("BMW", "Porsche", "Audi");
        //Create List
        List<Car> cNames = new ArrayList<>();
        //New ArrayList
        cNames = carNames.stream().map(Car::new).toList();
        //Reference constructor

        System.out.println(cNames);


    }
}
