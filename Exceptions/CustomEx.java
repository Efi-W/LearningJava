package Exceptions;

class MyException extends Exception{
    public MyException(String str){

        super(str);
    }
}

public class CustomEx {
    public static void main(String[] args) {

        try {
            throw new MyException("Error");
        }
        catch (MyException e){
            System.out.println("Exception caught");
        }

    }
}
