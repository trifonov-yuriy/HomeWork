package myProject;
import myProject.currencyService.*;
import myProject.inputOutputService.IPrinter;
import myProject.inputOutputService.IReader;
import myProject.inputOutputService.Printer;
import myProject.inputOutputService.Reader;
import myProject.logicService.ILogic;
import myProject.logicService.Logic;

import java.util.InputMismatchException;

public class Starter implements IStarter
{
    private Currency currency;

    private void getCurrency(String country)
    {
        switch(country)
        {
            case "ru" :
            {
                currency = new RussianCurrency();
            } break;

            case "us" :
            {
                currency = new AmericanCurrency();
            } break;

            case "en" :
            {
                currency = new EnglandCurrency();
            } break;

            default:
            {
                currency = new RussianCurrency();
            } break;
        }
    }

    public void start(String country) throws InputMismatchException, NullPointerException
    {
        getCurrency(country);
        IReader reader = new Reader();
        double digit = reader.readFromUser(); //Ввод числа пользователем
        ILogic logic = new Logic(currency);
        String myString = logic.getString(digit);
        System.out.println(myString);
    }
}
