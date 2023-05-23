package myProject.stringConvertService;

import java.util.HashMap;
import java.util.Map;

public class UnitsStringConverter
{
    private static Map<Integer, String> map;
    public static void initHashMap()
    {
        map = new HashMap<>();
        map.put(0, "");
        map.put(1, "один ");
        map.put(2, "два ");
        map.put(3, "три ");
        map.put(4, "четыре ");
        map.put(5, "пять ");
        map.put(6, "шесть ");
        map.put(7, "семь ");
        map.put(8, "восемь ");
        map.put(9, "девять ");
        map.put(1000, "одна "); //Для тысяч. Например, одна тысяча рублей.
        map.put(2000, "две "); //две тысячи рублей.
    }
    public static String getString(int value)
    {
        if(map == null)
        {
            initHashMap();
        }
        return map.get(value);
    }
}
