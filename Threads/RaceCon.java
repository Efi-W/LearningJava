package Threads;

class Counter{
    int count;
    public synchronized void increment(){ //Synchronized - Run one thread at a time.
        count++; //Increment count
    }
}

public class RaceCon {
    public static void main(String[] args) throws InterruptedException {

        Counter c = new Counter(); //Create new obj of Counter

        Runnable obj1 = () -> {   //Create Runnable Object (Lambda)
            for(int i = 0; i<1000; i++)
            {
                c.increment(); //Use Increment method from class Counter
            }
        };

        Runnable obj2 = () -> { //Create 2nd Runnable Object (Lambda)
            for(int i = 0; i<1000; i++)
            {
                c.increment(); //Use Increment method from class Counter
            }
        };

        Thread th1 = new Thread(obj1); //Create new Thread object to use Thread methods (Start, run)
        Thread th2 = new Thread(obj2); //Create 2nd Thread Object

        th1.start(); //Start 1st Thread
        th2.start(); // Start 2nd Thread

        th1.join(); //Thread waits for other thread to complete
        th2.join(); //Thread waits for other thread to complete

        System.out.println(c.count);
    }
}