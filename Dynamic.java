class A1
{
    public void Show()
    {
        System.out.println("Show A1");
    }
}

class B1 extends A1
{
    public void Show()
    {
        System.out.println("Show B1");
    }
}

class C1 extends A1
{
    public void Show()
    {
        System.out.println("Show C1");
    }
}



public class Dynamic
{
    public static void main(String[] args)
    {

        A1 obj = new A1();
        obj.Show();

        obj = new B1();
        obj.Show();

        obj = new C1();
        obj.Show();

    }
}
