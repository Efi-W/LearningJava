package interfaces;

interface Fruits{
    void eat();
}
//New interface called fruits (abstract)

class Banana implements Fruits{   //class Banana implements Fruits
    public void eat(){     //Eat method
        System.out.println("Eating a banana"); //In class banana eat method means eating a banana
    }
}

class Apple implements Fruits {  //class Apple implements Fruits
    public void eat(){  //Eat method
        System.out.println("Eating an apple"); //In class apple eat method means eating an apple
    }
}

class Human{     //create Human class
    public void eatFruit(Fruits obj){  //eatFruit method Uses interface Fruits and an obj
                                       //So it can access eat banana and apple from other classes

    }
}


public class Interfaces {
    public static void main(String[] args) {

       Fruits apple = new Apple();   //Create new Fruit object apple
       Fruits banana = new Banana(); //Create new Fruit object banana
       Human bob = new Human();    //Create a new human

       bob.eatFruit(apple);  //Bob eats an apple
       bob.eatFruit(banana); //Bob eats a banana





    }
}
