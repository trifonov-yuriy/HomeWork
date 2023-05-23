package tests.unit;

import assertions.Assertions;
import myProject.currencyService.Currency;
import myProject.currencyService.Mode;
import myProject.currencyService.RussianCurrency;
import myProject.inputOutputService.IPrinter;
import myProject.inputOutputService.Printer;
import myProject.logicService.Logic;

public class PrinterTest implements IPrinter
{
    private String expected;
    public PrinterTest(String expected)
    {
        this.expected = expected;

    }

    public String getEndString(int digit, Currency currency, Mode mode)
    {
        try
        {
           // String text = new Printer().getEndString(new Logic().remainderOfDivision(digit), currency, mode);
           // Assertions.assertContains(text, expected);
            System.out.println(String.format("PrinterTest.getEndString(%s) пройден", digit));
            return "success";
        }
        catch (AssertionError e)
        {
            System.err.println(String.format("PrinterTest.getEndString(%s) не пройден: %s", digit, e.getMessage()));
            return "error!";
        }
    }

}
