package tests.unit;

import assertions.Assertions;
import myProject.currencyService.*;

public class CurrencyTest implements Currency
{
    private Currency currency;
    private String expected;
    public CurrencyTest(Currency currency, String expected)
    {
        this.currency = currency;
        this.expected = expected;
    }

    public String getStringBasic(int value)
    {
        try
        {
            String text = currency.getStringBasic(value);
            Assertions.assertEquals(expected, text);
            System.out.println(String.format("CurrencyTest.getStringgBasic(%s) пройден", value));
            return "success";
        }
        catch (AssertionError e)
        {
            System.err.println(String.format("CurrencyTest.getStringgBasic(%s) не пройден: %s", value, e.getMessage()));
            return "error!";
        }
    }

    public String getStringAdditional(int value)
    {
        try
        {
            String text = currency.getStringAdditional(value);
            Assertions.assertEquals(expected, text);
            System.out.println(String.format("CurrencyTest.getStringAdditional(%s) пройден", value));
            return "success";
        }
        catch (AssertionError e)
        {
            System.err.println(String.format("CurrencyTest.getStringAdditional(%s) не пройден: %s", value, e.getMessage()));
            return "error!";
        }
    }


}
