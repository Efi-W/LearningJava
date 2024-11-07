package stream;

import java.util.List;
import java.util.Arrays;


public class OptionalC {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Sofia", "Aria", "Timo", "Jim");
        //Create List with names

        String name = names.stream().filter(str -> str.contains("a")).findFirst().orElse("Not found");
        //Turn names into Stream, filter to see if string contains A. Find the first one, or print "not found".
        System.out.println(name);


        List<String> upperNames = names.stream().map(String::toUpperCase).toList();
        //Using Method reference to convert all the names to upperCase, then convert it to a List.
        upperNames.forEach(System.out::println);
        //Method reference to print everything out.
    }
}
