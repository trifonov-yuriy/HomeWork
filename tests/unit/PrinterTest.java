package tests.unit;

import assertions.Assertions;
import myProject.currencyService.Currency;
import myProject.currencyService.RussianCurrency;
import myProject.inputOutputService.IPrinter;
import myProject.inputOutputService.Printer;

public class PrinterTest implements IPrinter
{
    private String expected;
    public PrinterTest(String expected)
    {
        this.expected = expected;
    }

    public String getEndString(int digit, Currency currency)
    {
        try
        {
            String text = new Printer().getEndString(digit, currency);
            Assertions.assertContains(text, expected);
            System.out.println(String.format("PrinterTest.getString(%s) пройден", digit));
            return "success";
        }
        catch (AssertionError e)
        {
            System.err.println(String.format("PrinterTest.getString(%s) не пройден: %s", digit, e.getMessage()));
            return "error!";
        }
    }

}
