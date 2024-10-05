class Info
{
    private int age;
    private String name;

    public Info()
    {
        age = 31;
        name = "John";
    }

    public int getAge()
    {
        return age;
    }
    public void setAge(int a)
    {
        this.age = a;
    }


    public String getName()
    {
        return name;
    }
    public void setName(String n)
    {
        name = n;
    }
}

public class Encapsulation
{
    public static void main(String[] args)
    {
        Info obj = new Info();
        Info ob1 = new Info();
        System.out.println(obj.getName() + " : " + obj.getAge());


        obj.setAge(60);
        obj.setName("Bob");

    }
}
