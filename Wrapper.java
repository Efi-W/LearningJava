public class Wrapper
{
    public static void main(String[] args)
    {
        int num = 17;
        Integer num1 = num;  // Autoboxing

        int num2 = num1; //Auto-unboxing

        System.out.println(num2);


        String str = "23";
        int num3 = Integer.parseInt(str);

        System.out.println(num3*2);

    }
}
