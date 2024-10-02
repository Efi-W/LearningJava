class Student
{
    int id;
    String name;
    int marks;
}






public class ArrayObject
{
    public static void main(String[] args)

    {
        Student s1 = new Student();
        s1.id = 1;
        s1.name = "John";
        s1.marks = 78;

        Student s2 = new Student();
        s2.id = 2;
        s2.name = "Jane";
        s2.marks = 91;

        Student s3 = new Student();
        s3.id = 3;
        s3.name = "Eva";
        s3.marks = 43;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

       // for (int i=0; i< students.length; i++)
       // {
       //     System.out.println(students[i].name + " : " + students[i].marks);
       // }

        for (Student stud : students)
        {
            System.out.println(stud.name +  " : " + stud.marks);
        }


    }

}
