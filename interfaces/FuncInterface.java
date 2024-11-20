package interfaces;

@FunctionalInterface   //Make sure there is one method.
interface A{
    void Type(int j);

}

public class FuncInterface {
    public static void main(String[] args) {

//         A typ = new A(){
//
//            public void Type(){
//                System.out.println("Typing..");
//            }
//        };
//        typ.Type(2);


        A typ2 = j -> System.out.println("Typing..");
        typ2.Type(20);

    }
}
