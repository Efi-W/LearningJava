import test.Inheritance;
import test.*;

public class Calculations
{
    public static void main(String[] args)
    {
        Inheritance obj = new Inheritance();
        int r1 = obj.add(2,5);
        int r2 = obj.sub(2,5);
        int r3 = obj.multi(2,5);
        int r4 = obj.div(5,10);

        System.out.println(r1 + " " + r2+ " " + r3 + " " + r4);
    }

    Inheritance obj = new Inheritance();
}
