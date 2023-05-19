package tests;

import myProject.currencyService.Currency;
import myProject.currencyService.AmericanCurrency;
import myProject.currencyService.RussianCurrency;
import myProject.logicService.ILogic;
import myProject.inputOutputService.IPrinter;
import tests.unit.CurrencyTest;
import tests.unit.LogicTest;
import tests.unit.PrinterTest;

public class AllTests
{
    public static void main(String[] args)
    {
        Currency currencyTest = new CurrencyTest(new RussianCurrency(), "рубль");
        currencyTest.getString(1);

        currencyTest = new CurrencyTest(new RussianCurrency(), "рубля");
        currencyTest.getString(2);
        currencyTest.getString(4);

        currencyTest = new CurrencyTest(new RussianCurrency(), "рублей");
        currencyTest.getString(5);
        currencyTest.getString(19);

        currencyTest = new CurrencyTest(new AmericanCurrency(), "доллар");
        currencyTest.getString(1);

        currencyTest = new CurrencyTest(new AmericanCurrency(), "доллара");
        currencyTest.getString(2);
        currencyTest.getString(4);

        currencyTest = new CurrencyTest(new AmericanCurrency(), "долларов");
        currencyTest.getString(0);
        currencyTest.getString(5);
        currencyTest.getString(19);

        IPrinter printerTest = new PrinterTest("рублей");
        printerTest.getEndString(12, new RussianCurrency());

        printerTest = new PrinterTest("ОШИБКА ОПРЕДЕЛЕНИЯ ВАЛЮТЫ:");
        printerTest.getEndString(12, null);

        ILogic logicTest = new LogicTest("двести сорок пять ", 5);
        logicTest.getString(245);
        logicTest.remainderOfDivision(245);

        logicTest = new LogicTest("ноль ", 0);
        logicTest.getString(0);
        logicTest.remainderOfDivision(0);

        logicTest = new LogicTest("один миллиард двести сорок пять тысяч три ", 3);
        logicTest.getString(1000245003);
        logicTest.remainderOfDivision(1000245003);


    }
}
