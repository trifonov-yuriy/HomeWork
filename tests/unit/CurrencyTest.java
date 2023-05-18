package tests.unit;

import assertions.Assertions;
import myProject.currencyService.AmericanCurrency;
import myProject.currencyService.Currency;
import myProject.currencyService.EnglandCurrency;
import myProject.currencyService.RussianCurrency;
import myProject.logicService.Logic;

public class CurrencyTest implements Currency
{
    private Currency currency;
    private String expected;
    public CurrencyTest(Currency currency, String expected)
    {
        this.currency = currency;
        this.expected = expected;
    }

    public String getString(int value)
    {
        try
        {
            String text = currency.getString(value);
            Assertions.assertEquals(expected, text);
            System.out.println(String.format("CurrencyTest.getString(%s) пройден", value));
            return "success";
        }
        catch (AssertionError e)
        {
            System.err.println(String.format("CurrencyTest.getString(%s) не пройден: %s", value, e.getMessage()));
            return "error!";
        }
    }


}
