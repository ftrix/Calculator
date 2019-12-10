package calku;
import calku.Input;
import java.util.HashMap;

public class Rome {
    public static String ra;
    public static int r;
    public static boolean m;
    public static void rome (){
        try {
        ra = Input.c;
        HashMap<String, Integer> romecifr = new HashMap<>();
        romecifr.put("I",1);
        romecifr.put("II",2);
        romecifr.put("III",3);
        romecifr.put("IV",4);
        romecifr.put("V",5);
        romecifr.put("VI",6);
        romecifr.put("VII",7);
        romecifr.put("VIII",8);
        romecifr.put("IX",9);
        romecifr.put("X",10);
        r = romecifr.get(ra);
            if (romecifr.containsKey(ra))
            {
                m = true;
            }
            else {
                m = false;
            }
        }
        catch (NullPointerException e){}
    }
    }

