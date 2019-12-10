package calku;
import calku.Rome;
import calku.Input;
import java.util.Scanner;

public class Deystvie {
    public static double rez;
    public static boolean s;
    public static boolean ss;
    public static void znak() {
        Input chisloOne = new Input();
        chisloOne.chislo();
        double a = chisloOne.a;
        s = Input.b;
        Rome chisloOn = new Rome();
        chisloOn.rome();
        double c = chisloOn.r;
        Input chisloTwo = new Input();
        chisloTwo.chislo();
        double b = chisloTwo.a;
        ss = Input.b;
        Rome chisloTw = new Rome();
        chisloTw.rome();
        double d = chisloTw.r;
        if (s == false && s == ss) {
            System.out.println("Выбери действие \n 1 - умножение \n 2 - деление \n 3 - сложение \n 4 - вычитание");
            Scanner in = new Scanner(System.in);
            int znak = in.nextInt();
            if (znak == 1) {
                rez = c * d;
            } else if (znak == 2) {
                rez = c / d;
            } else if (znak == 3) {
                rez = c + d;
            } else if (znak == 4) {
                rez = c - d;
            } else {
                System.out.println("Не обманешь!");
            }
            System.out.println(rez);
        } else if (s == true && s == ss) {
            System.out.println("Выбери действие \n 1 - умножение \n 2 - деление \n 3 - сложение \n 4 - вычитание");
            Scanner in = new Scanner(System.in);
            int znak = in.nextInt();
            if (znak == 1) {
                rez = a * b;
            } else if (znak == 2) {
                rez = a / b;
            } else if (znak == 3) {
                rez = a + b;
            } else if (znak == 4) {
                rez = a - b;
            } else {
                System.out.println("Не обманешь!");
            }
            System.out.println(rez);
        }
        else {
            System.out.println("Одинаковые цифры!");
        }
    }
}