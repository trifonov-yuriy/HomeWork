package myProject.inputOutputService;

import myProject.currencyService.Currency;

public class Printer implements IPrinter
{
    public String getEndString(int digit, Currency currency)
    {
        String text = "";
        try
        {
            text = currency.getString(digit);
        }
        catch (Exception e)
        {
            text = String.format("\nОШИБКА ОПРЕДЕЛЕНИЯ ВАЛЮТЫ: %s", e.getMessage());
        }
        return text;
    }



}
