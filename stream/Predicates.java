package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Predicates {
    public static void main(String[] args) {

        List<Integer> numb = Arrays.asList(20, 18, 19, 2, 54);

        Predicate<Integer> p = i -> i%2==0;
        //Use Predicate, p is a condition for even numbers.
        numb.stream().filter(p).forEach(System.out::println);
        //Turn numb into stream & filter using condition p, then for each, print even numbers.


        Stream<Integer> sortVal = numb.stream().sorted();
        //Create new stream which is sorted.
        sortVal.forEach(s -> System.out.println(s));
        //Print sorted stream.


    }

}

