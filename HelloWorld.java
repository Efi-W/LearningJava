public class HelloWorld {

    public static void main(String args[])
    {
      int i = 1;

      while (i <= 5)
      {
         System.out.println("Outer loop " + i);
         int j = 1;
         while (j<=2)
         {
             System.out.println("Inner loop " + j);
             j++; //increment
         }


         i++; //increment
      }





    }
}
