package Exceptions;

class A{
    public void show() throws ClassNotFoundException { //throws the exception
        Class.forName("Qhdsjh"); //check if there is a class with this name
    }

}

public class ThrowsEx {

    public static void main(String[] args) {

        A obj = new A(); //Create new a obj
        try {
            obj.show(); //call show method
        } catch (ClassNotFoundException e) { //try, catch
            System.out.println(e.getMessage());;

        }

    }
}
