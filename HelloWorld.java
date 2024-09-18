class Calculator{

    public int add(int n1,int n2) // parameters
    {
        int r = n1 + n2; // add n1+n2
        return r;   //return
    }

}

public class HelloWorld {

    public static void main(String args[])
    {
      int num1 = 60; // values of num1/n1
      int num2 = 40; // value of num2/n2

      Calculator calc = new Calculator(); // create new object
      int result = calc.add(num1,num2); // add values
      System.out.println(result); //print result


    }
}
