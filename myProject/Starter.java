package myProject;
import myProject.currencyService.AmericanCurrency;
import myProject.currencyService.Currency;
import myProject.currencyService.EnglandCurrency;
import myProject.currencyService.RussianCurrency;
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
    public void start(String country) throws InputMismatchException, NullPointerException
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

        IReader reader = new Reader();
        int digit = reader.readFromUser(); //Ввод числа пользователем
        ILogic logic = new Logic();
        IPrinter printer = new Printer();
        String myString = logic.getString(digit);
        myString += printer.getEndString(logic.remainderOfDivision(digit), currency);
        System.out.println(myString);

    }
}
