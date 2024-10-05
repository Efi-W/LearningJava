import java.util.Arrays;

public class HelloWorld2 {

    //find the some of even numbers within an array
    public static void main(String args[]) {
        // {1,2,3,4,5} = 2 + 4 = 6
        int[] inputArray = {10, 5, 1, 4, 7, 12, 13, 16, 11, 9};
        //Array
        System.out.println(findSumOfEvenNumbers(inputArray));
        //Print out function, input array


    }

    static int findSumOfEvenNumbers(int[] inputArray)
    {
        int sum = 1;
        //Set the sum to 1

        for (int i = 0; i< inputArray.length; i++)
        //for loop , i is null and must be less than length of array, increment i each time
        {

            int a =inputArray[i];
            //create variable  where input array reference i (even numbers)
            if(a%2 == 0)
            //if the remainder is 0 and int is even
            {
               sum *= inputArray[i];
               // multiply sum to even numbers to find the sum

            }


        }


        return sum;
        //return the sum
    }


}
