package collections;

import com.sun.source.tree.Tree;

import java.util.*;


public class Sets {

    public static void main(String[] args)
    {
        Collection<Integer> nums2 = new TreeSet<>(); //HashSet Unsorted, TreeSet Sorted.
        nums2.add(66);
        nums2.add(17);
        nums2.add(63);
        nums2.add(35);

        for(int n: nums2)
        {
            /*
           int nmb = (Integer)n;
            System.out.println(nmb*2);
           */
            System.out.println(n);
        }

        Iterator<Integer> values = nums2.iterator();
        while(values.hasNext())
        {
            System.out.println(values.next());

        }

    }
}

