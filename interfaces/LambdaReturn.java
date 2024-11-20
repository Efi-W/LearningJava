package interfaces;

@FunctionalInterface
interface AddNums{
    int add(int i, int j);
    //add parameters
}

public class LambdaReturn {
    public static void main(String[] args) {

        AddNums obj = (i,j) -> i+j;
        //lambda i+j

        int r = obj.add(60,6);
        //add
        System.out.println(r);

    }
}
