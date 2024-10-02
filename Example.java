public class Example
{
    public static void main(String[] args)
    {

       String[] myStrings = {"A","B","C","D"};
       int[] myInts = {3,4,5,6};
       myStrings[0] = "Hi";


        System.out.println(myStrings[0]);
        System.out.println(myStrings.length);

        int[][] myNumbers = { {1, 2, 3, 4 }, {5, 6, 7, 8} };
        System.out.println(myNumbers[1][3]);

        myNumbers[1][2] = 9;
        System.out.println(myNumbers[1][2]);


        for (int i = 0; i < myStrings.length; i++) {
            System.out.println(myStrings[i]);

        }
        for (int i = 0; i < myNumbers.length; ++i) {
            for (int j = 0; j < myNumbers[i].length; ++j) {
                System.out.println(myNumbers[i][j]);
            }
        }
    }
}
