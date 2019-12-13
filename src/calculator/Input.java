package calculator;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
    public static int inputvalue;                               //Переменная для арабских чисел
    public static String inputstring;                           //Переменная для римских цифр
    public static boolean typevalues;                           //Переменная для определения типа введенного значения
    public static void inputvalues() {
            System.out.println("Введи целое число от 0 до 10!");
            Scanner in = new Scanner(System.in);
            try {                                               //Проверка ввода арабских цифр
                int input = in.nextInt();
                inputvalue = input;
                typevalues = true;
            }
            catch (InputMismatchException e) {                  //Проверка ввода других значений
                String input = in.nextLine();
                inputstring = input;
                typevalues = false;
            }
    }
}


