package inputoutput;

import java.io.Console;
import java.util.Scanner;

public class DataInput {
    public void inputPassword() {
        Console cons = System.console();
        String userName = cons.readLine("User name: ");
        char[] passwd = cons.readPassword("Password: ");
    }
    public void testInput() {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int temp = in.nextInt();
            System.out.print(temp + " ");
        }
    }
}
