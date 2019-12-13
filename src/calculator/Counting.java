package calculator;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Counting {
    public static double result;                        //Переменная результата
    public static boolean typeValueOne;                 //Переменная для проверки типа первого числа
    public static boolean typeValueTwo;                 //Переменная для проверки типа второго числа
    public static void counting() {
        Input valueOne= new Input();                    //Объект для первого числа
        valueOne.inputvalues();
        double a = valueOne.inputvalue;
        typeValueOne = Input.typevalues;
        RomeValues romeOne = new RomeValues();          //Объект для первого числа, если введенное число не арабское
        romeOne.romeHashMap();
        double c = romeOne.romevalue;
        Input valueTwo = new Input();                   //Объект для второго числа
        valueTwo.inputvalues();
        double b = valueTwo.inputvalue;
        typeValueTwo = Input.typevalues;
        RomeValues romeTwo = new RomeValues();          //Объект для второго числа, если введенное число не арабское
        romeTwo.romeHashMap();
        double d = romeTwo.romevalue;
        //Условие для вывода, если цифры римские
        if (Input.typevalues == false && typeValueOne == typeValueTwo && RomeValues.onlyrome == true) {
            try {
            System.out.println("Выбери действие \n 1 - умножение \n 2 - деление \n 3 - сложение \n 4 - вычитание");
            Scanner in = new Scanner(System.in);
            int operation = in.nextInt();

            if (operation == 1) {
                result = c * d;
            } else if (operation== 2) {
                result = c / d;
            } else if (operation == 3) {
                result = c + d;
            } else if (operation == 4) {
                result = c - d;
            } else {
                System.out.println("Не обманешь!");
            }
            }
            catch (InputMismatchException e){
                System.out.println("Не обманешь!");
            }
            System.out.println(result);
            //Условие для ввывода, если цифры арабские в диапазоне от 0 до 10
        } else if (Input.typevalues == true && typeValueOne == typeValueTwo && a >= 0 && a <= 10 && b >= 0 && b <= 10) {
            try {
            System.out.println("Выбери действие \n 1 - умножение \n 2 - деление \n 3 - сложение \n 4 - вычитание");
            Scanner in = new Scanner(System.in);
            int operation = in.nextInt();

            if (operation == 1) {
                result = a * b;
            } else if (operation == 2 && b != 0) {
                result = a / b;
            } else if (operation == 3) {
                result = a + b;
            } else if (operation == 4) {
                result = a - b;
            }
            else {
                System.out.println("Не обманешь!");
            }
            }
            catch (InputMismatchException e){
                System.out.println("Не обманешь!");
            }
            System.out.println(result);
        }
        else {
            System.out.println("Не хитрить");
        }
    }
}