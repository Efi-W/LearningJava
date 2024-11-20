package Threads;

//Runnable is interface so implement it when using class.

public class Runnables {
    public static void main(String[] args) {

        Runnable obj1 = () -> {   //Create Runnable Object (Lambda)
                for(int i = 0; i<5; i++) { //Loop through 5 times
                    System.out.println("XXXXXX"); //Print
                    try {Thread.sleep(10);} catch (InterruptedException e) {throw new RuntimeException(e);}
                    //Sleep for 10 milliseconds for each one, catch Exception
                }
        };
        Runnable obj2 = () -> { //Create 2nd Runnable Object (Lambda)
                for(int i = 0; i<5; i++){ //Loop through 5 times
                    System.out.println("YYY"); //Print
                    try {Thread.sleep(10);} catch (InterruptedException e) {throw new RuntimeException(e);}
                    //Sleep for 10 milliseconds for each one, catch Exception
                }
            };

        Thread th1 = new Thread(obj1); //Create new Thread object to use Thread methods (Start, run)
        Thread th2 = new Thread(obj2); //Create 2nd Thread Object

        th1.start(); //Start 1st Thread
        try {Thread.sleep(10);} catch (InterruptedException e) {throw new RuntimeException(e);}
        th2.start(); // Start 2nd Thread
    }
}
