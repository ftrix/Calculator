package calkulator;
import java.util.HashMap;

public class RomeValues {
    public static String index;                     //Индекс HashMap
    public static int romevalue;                    //Значение индекса
    public static boolean onlyrome;                 //Переменная для проверки ввода значений из HashMap
    public static void romeHashMap (){
        try {
        index = Input.inputstring;
        HashMap<String, Integer> arabicvalues = new HashMap<>();
            arabicvalues.put("I",1);
            arabicvalues.put("II",2);
            arabicvalues.put("III",3);
            arabicvalues.put("IV",4);
            arabicvalues.put("V",5);
            arabicvalues.put("VI",6);
            arabicvalues.put("VII",7);
            arabicvalues.put("VIII",8);
            arabicvalues.put("IX",9);
            arabicvalues.put("X",10);
        romevalue = arabicvalues.get(index);            //Запись в переменную значения индекса
            if (arabicvalues.containsKey(index))        //Проверка вода допустимых значений из HashMap
            {
                onlyrome = true;                    //Истина
            }
            else {
                onlyrome = false;                   //Ложь
            }
        }
        catch (NullPointerException e){}            //Обработка ошибок ввода
    }
    }

