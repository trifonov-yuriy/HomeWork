package myProject.inputOutputService;

import myProject.currencyService.Currency;
import myProject.currencyService.Mode;
import myProject.currencyService.RussianCurrency;

public class Printer implements IPrinter
{
    public String getEndString(int digit, Currency currency, Mode mode)
    {
        String text = "";
        try
        {
            switch(mode) {
                case Basic : {
                    text = currency.getStringBasic(digit);
                }break;
                case Additional:
                {
                     text = currency.getStringAdditional(digit);
                } break;
            }
        }
        catch (Exception e)
        {
            text = String.format("\nОШИБКА ОПРЕДЕЛЕНИЯ ВАЛЮТЫ: %s", e.getMessage());
        }
        return text;
    }



}
