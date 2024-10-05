class Info
{
    private int age;
    private String name;

    public int getAge()
    {
        return age;
    }
    public void setAge(int a)
    {
        age = a;
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
        obj.setAge(60);
        obj.setName("Bob");
        System.out.println(obj.getName() + " : " + obj.getAge());
    }
}
