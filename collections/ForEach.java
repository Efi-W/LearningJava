package collections;

import java.util.List;
import java.util.Arrays;


public class ForEach {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(17,66,35,31,63,35,19);
        nums.forEach(n -> System.out.println(n));
    }
}
