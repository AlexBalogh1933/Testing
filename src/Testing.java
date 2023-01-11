import java.util.Scanner;
public class Testing
{
    public static void main(String[] args)
    {
        // System.out.println("Hello world!");

        int favNum = 0;
        Scanner in = new Scanner(System.in);

        favNum = SafeInput.getRangedInt(in, "What is you Fav Num", 1, 10 );

        System.out.println("You said your Fav Num is: " + favNum);
    }
}