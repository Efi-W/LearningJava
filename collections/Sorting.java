package collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

class People implements Comparable<People>
    //Implement Comparables to allow it to sort "People"
{
    String name;
    int age;


    public People(String name, int age){
        this.name = name;
        this.age = age;

    }


    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public int compareTo(People that) {
        if (this.age > that.age) {
            return 1;
        } else {
            return -1;
        }
        //Sort Comparables using compareTo method
    }
}

public class Sorting {
    public static void main(String[] args)
    {
        Comparator<People> com= new Comparator<People>() {
            public int compare(People i, People j) {
                if (i.age > j.age) {
                    return 1;
                } else {
                    return -1;
                }
                //Compare last digits in each number and sort them.
                //Return 1, sort. Return -1, no sort.

            }

        };


        List<People> ppl = new ArrayList<>();
        ppl.add(new People("Bob", 63));
        ppl.add(new People("Jon" , 17));
        ppl.add(new People("Timo", 66));
        ppl.add(new People("Emi", 35));
        //New Array List

        Collections.sort(ppl);
        for(People p: ppl) {
            System.out.println(p);
        }
        //Print Sorted results

    }
}
