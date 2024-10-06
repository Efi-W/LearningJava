class X
{
    public void Show1()
    {
        System.out.println("X");
    }

}

class Y extends X
{
    public void Show2()
    {
        System.out.println("Y");
    }
}


public class UpCastDownCast
{
    public static void main(String[] args)
    {
        X obj = new Y(); //Upcasting
        obj.Show1();

        Y obj1 = (Y) obj; //Downcasting
        obj1.Show2();
    }
}
