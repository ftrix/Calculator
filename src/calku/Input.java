package calku;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Input {
    public static int a;
    public static String c;
    public static boolean b;
    public static void chislo() {
            System.out.println("Введи целое число!");
            Scanner in = new Scanner(System.in);
            try {
                int input = in.nextInt();
                a = input;
                b = true;
            }
            catch (InputMismatchException e) {
                String input = in.nextLine();
                c = input;
                b = false;
            }
    }
}


