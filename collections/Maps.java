package collections;
import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args)
    {
        Map<String, Integer> data = new HashMap<>();

        data.put("A", 1);
        data.put("B", 2);
        data.put("C", 3);
        data.put("D", 4);

        System.out.println(data);
        System.out.println(data.get("A")); //Print value of Key "A".
        System.out.println(data.keySet()); //Get Key Values only.

        for (String a : data.keySet()){
            System.out.println(a + " " + data.get(a)); //Print Key's and values of keys.
        }

    }
}
