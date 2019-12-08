package calku;
import java.util.Scanner;

public class Input{
    public static int a;
    public static void chislo (){
        System.out.println("Введи целое число!");
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        a = input;
        }

}
