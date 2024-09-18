public class HelloWorld {

    public static void main(String args[])
    {

        int dice = 1;
        while (dice <= 5){

            if (dice < 5){

                System.out.println("Dice less than 5");
            }
            else{

                System.out.println("Dice greater or equal to 5");
            }

            dice = dice+1;
        }

    }
}
