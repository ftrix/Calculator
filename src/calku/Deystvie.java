package calku;
import calku.Input;

import java.util.Scanner;

public class Deystvie {
    public static double rez;
    public void znak(){
        Input chisloOne = new Input();
        chisloOne.chislo();
        double a = chisloOne.a;
        Input chisloTwo = new Input();
        chisloTwo.chislo();
        double b = chisloTwo.a;
        System.out.println("Выбери действие \n 1 - умножение \n 2 - деление \n 3 - сложение \n 4 - вычитание");
        Scanner in = new Scanner(System.in);
        int znak = in.nextInt();
        if (znak == 1){
            rez = a * b;
        }
        else if (znak == 2){
            rez = a / b;
        }
        else if (znak == 3){
            rez = a + b;
        }
        else if (znak == 4){
            rez = a - b;
        }
        else {
            System.out.println("Не обманешь!");
        }
        System.out.println(rez);
        }
}