package Threads;

class A extends Thread  //Class Extends Thread
{
    public void run() {   //Run Method
        for(int i = 0; i<50; i++) { //Loop through 50 times
            System.out.println("AAAAAAA"); //Print
            try {Thread.sleep(10);} catch (InterruptedException e) {throw new RuntimeException(e);}
            //Wait 10 milliseconds for each one, catch Exception
        }
    }
}

class B extends Thread //Class Extends Thread
{
    public void run(){ //Run Method
        for(int i = 0; i<50; i++){ //Loop through 50 times
            System.out.println("BBBB"); //Print
            try {Thread.sleep(10);} catch (InterruptedException e) {throw new RuntimeException(e);}
            //Wait 10 milliseconds for each one, catch Exception
        }
    }
}


public class Threads  {
    public static void main(String[] args) {

        A obj1 = new A(); //Create new Obj of A Class
        B obj2 = new B(); //Create new Obj of B Class

        obj2.setPriority(10); //Set Obj2 priority to 10 (max)

        obj1.start(); //Start 1st Thread
        try {Thread.sleep(10);} catch (InterruptedException e) {throw new RuntimeException(e);}
        //Sleep 10 milliseconds after one starts, catch Exception
        obj2.start(); //Start 2nd Thread
    }
}
