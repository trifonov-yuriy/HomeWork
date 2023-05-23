package myProject.stringConvertService;

import java.util.HashMap;
import java.util.Map;

public class TensStringConverter
{
    private static Map<Integer, String> map;

    private static void initHashMap()
    {
        map = new HashMap<>();
        map.put(0, "");
        map.put(10, "десять ");
        map.put(11, "одиннадцать ");
        map.put(12, "двенадцать ");
        map.put(13, "тринадцать ");
        map.put(14, "четырнадцать ");
        map.put(15, "пятнадцать ");
        map.put(16, "шестьнадцать ");
        map.put(17, "семьнадцать ");
        map.put(18, "восемьнадцать ");
        map.put(19, "девятьнадцать ");
        map.put(2, "двадцать ");
        map.put(3, "тридцать ");
        map.put(4, "сорок ");
        map.put(5, "пятьдесят ");
        map.put(6, "шестьдесят ");
        map.put(7, "семьдесят ");
        map.put(8, "восемьдесят ");
        map.put(9, "девяносто ");
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
