package tests.unit;

import assertions.Assertions;
import game.*;

import java.util.Random;

public class DiceImplTest
{
    public void testRollForRange()
    {
        String scenario = "Тест метода Dice.roll() (Проверка на диапазон [1-6]) ";
        Dice dice = new DiceImpl();
        for(int i = 0; i < 30; i++)
        {
            int valueTest = dice.roll();
            try
            {
                Assertions.assertRange(valueTest, 1, 6);
                System.out.println(String.format("%s пройден", scenario));
            }
            catch (Error e)
            {
                System.err.println(String.format("%s не пройден: %s", scenario, e.getMessage()));
                return;
            }
        }
    }


}
