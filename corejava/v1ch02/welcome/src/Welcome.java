/**
 * This program displays a greeting for me.
 * @version 1.00 2021-5-26
 * @author XCJ
 */
public class Welcome
{
    public static void main(String[] args)
    {
        String greeting = "Welcome to Core Java!";
        System.out.println(greeting);
        for (int i = 0; i < greeting.length(); i++)
            System.out.print("=");
        System.out.println();
        System.out.println(2.0 - 1.1);
    }
}
