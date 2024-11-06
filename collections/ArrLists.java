package collections;
import java.util.ArrayList;
import java.util.List;

public class ArrLists {
    public static void main(String[] args)
    {
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);

        nums.addAll(List.of(5,6,7));
        //Add Multiple values
        nums.set(2, 66);
        //Replace value at index 2 to 66
        System.out.println(nums.indexOf(2));
        // Prints index of value 2
        System.out.println(nums.get(2));
        //Get value at index

        boolean isEmpty = nums.isEmpty();
        System.out.println(isEmpty);

    }


}
