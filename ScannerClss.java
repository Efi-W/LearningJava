import java.util.Scanner;

public class ScannerClss {
    public static void main(String[] args) {

        System.out.println("What is your name?: ");
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        System.out.println("Hello " + str);

    }
}
