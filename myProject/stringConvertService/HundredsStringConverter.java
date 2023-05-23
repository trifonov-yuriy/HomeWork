package myProject.stringConvertService;

import java.util.HashMap;
import java.util.Map;

public class HundredsStringConverter
{
    private static Map<Integer, String> map;
    private static void initHashMap()
    {
        map = new HashMap<>();
        map.put(0, "");
        map.put(1, "сто ");
        map.put(2, "двести ");
        map.put(3, "триста ");
        map.put(4, "четыреста ");
        map.put(5, "пятьсот ");
        map.put(6, "шестьсот ");
        map.put(7, "семьсот ");
        map.put(8, "восемьсот ");
        map.put(9, "девятьсот ");
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
