package Exceptions;

public class TryException {
    public static void main(String[] args) {

        int i = 2;
        int j = 0;

        int nums[] = new int[3];
        String str = null;

        try
        {
            j = 100/i;
            System.out.println(str.length());
            System.out.println(nums[0]);
            System.out.println(nums[8]);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Cannot divide by 0");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array index out of range");
        }
        catch(Exception e)
        {
            System.out.println("Ran into an error" + e);
        }

        System.out.println(j);


    }
}
