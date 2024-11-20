package Exceptions;


public class ThrowEx {
    static void ageChecker(int age){

        if (age < 18){
            throw new ArithmeticException("Need to be 18 or older");
        }
        else{
            System.out.println("Old enough");
        }

    }

    public static void main(String[] args) {
        ageChecker(18);
    }
}
