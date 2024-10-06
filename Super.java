class A extends Object
{
    public A()
    {
        super();
        System.out.println("In A");
    }

    public A(int n)
    {
        super();
        System.out.println("Int A");
    }
}

class B extends A
{
    public B()
    {
        super();
        System.out.println("In B");
    }

    public B(int n)
    {
        this();
        System.out.println("Int B");
    }
}

public class Super
{
    public static void main(String[] args)
    {
      B obj = new B(5);
    }
}
