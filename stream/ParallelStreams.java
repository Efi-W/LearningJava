package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ParallelStreams {
    public static void main(String[] args) {

        int length = 5_000;
        List<Integer> list = new ArrayList<>(length);
        //Create new Array List.

        Random rand = new Random();
        //Create Random Object
        for(int i = 0; i<length; i++){

            list.add(rand.nextInt(100));
            //Add to list, random numbers in bound 100
        }

        long start1 = System.currentTimeMillis();
        int sum1 = list.stream().map(i -> i*2).reduce(0, (c,e) -> c+e);
        //Create Stream, map & reduce it. Normal - stream, executes sequentially.
        long end1 = System.currentTimeMillis();

        long start2 = System.currentTimeMillis();
        int sum2 = list.stream().map(i-> i*2).mapToInt(i -> i).sum();
        //Convert to stream, map & map to int without changing it then find the sum. (Convert mapToInt to get sum())
        long end2 = System.currentTimeMillis();

        long start3 = System.currentTimeMillis();
        int sum3 = list.parallelStream().map(i-> i*2).mapToInt(i-> i).sum();
        //Using parallel stream - performs everything at the same time with multiple threads.
        long end3 = System.currentTimeMillis();

        System.out.println("1) " + (end1 - start1));
        System.out.println("2) " + (end2 - start2));
        System.out.println("3) " + (end3 - start3));
        //Calculating how fast it takes each one

    }
}
