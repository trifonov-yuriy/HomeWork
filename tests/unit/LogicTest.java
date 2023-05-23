package tests.unit;

import assertions.Assertions;
import myProject.currencyService.Currency;
import myProject.currencyService.Mode;
import myProject.inputOutputService.Printer;
import myProject.logicService.ILogic;
import myProject.logicService.Logic;

public class LogicTest implements ILogic
{
    private String expectedString;
    private Currency currency;


    public LogicTest(String expectedString, Currency currency)
    {
        this.expectedString = expectedString;
        this.currency = currency;
    }

    public String getString(double digit)
    {
        String text = "";
        try
        {
            text = new Logic(currency).getString(digit);
            Assertions.assertEquals(expectedString, text);
            System.out.println(String.format("LogicTest.getString(%s) пройден", digit));
            return "success";
        }
        catch (AssertionError e)
        {
            System.err.println(String.format("LogicTest.getString(%s) не пройден: %s", digit, e.getMessage()));
            return "error!";
        }

    }


}
