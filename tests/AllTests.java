package tests;

import myProject.currencyService.AmericanCurrency;
import myProject.currencyService.Mode;
import myProject.currencyService.RussianCurrency;
import myProject.inputOutputService.IPrinter;
import myProject.logicService.ILogic;
import tests.unit.CurrencyTest;
import tests.unit.LogicTest;
import tests.unit.PrinterTest;

public class AllTests
{
    public static void main(String[] args)
    {
        IPrinter printerTest = new PrinterTest("рубль ");
        printerTest.getEndString(1, new RussianCurrency(), Mode.Basic);
        printerTest.getEndString(21, new RussianCurrency(), Mode.Basic);
        printerTest.getEndString(101, new RussianCurrency(), Mode.Basic);
        printerTest.getEndString(121, new RussianCurrency(), Mode.Basic);

        printerTest = new PrinterTest("рубля ");
        printerTest.getEndString(2, new RussianCurrency(), Mode.Basic);
        printerTest.getEndString(23, new RussianCurrency(), Mode.Basic);
        printerTest.getEndString(102, new RussianCurrency(), Mode.Basic);
        printerTest.getEndString(122, new RussianCurrency(), Mode.Basic);

        printerTest = new PrinterTest("рублей ");
        printerTest.getEndString(5, new RussianCurrency(), Mode.Basic);
        printerTest.getEndString(11, new RussianCurrency(), Mode.Basic);
        printerTest.getEndString(12, new RussianCurrency(), Mode.Basic);
        printerTest.getEndString(20, new RussianCurrency(), Mode.Basic);
        printerTest.getEndString(25, new RussianCurrency(), Mode.Basic);
        printerTest.getEndString(30, new RussianCurrency(), Mode.Basic);
        printerTest.getEndString(100, new RussianCurrency(), Mode.Basic);
        printerTest.getEndString(105, new RussianCurrency(), Mode.Basic);
        printerTest.getEndString(110, new RussianCurrency(), Mode.Basic);
        printerTest.getEndString(111, new RussianCurrency(), Mode.Basic);
        printerTest.getEndString(112, new RussianCurrency(), Mode.Basic);
        printerTest.getEndString(115, new RussianCurrency(), Mode.Basic);
        printerTest.getEndString(120, new RussianCurrency(), Mode.Basic);
        printerTest.getEndString(125, new RussianCurrency(), Mode.Basic);
        printerTest.getEndString(100, new RussianCurrency(), Mode.Basic);
        printerTest.getEndString(110, new RussianCurrency(), Mode.Basic);
        printerTest = new PrinterTest("ОШИБКА ОПРЕДЕЛЕНИЯ ВАЛЮТЫ:");
        printerTest.getEndString(12, null, Mode.Basic);


        printerTest = new PrinterTest("доллар ");
        printerTest.getEndString(1, new AmericanCurrency(), Mode.Basic);
        printerTest.getEndString(21, new AmericanCurrency(), Mode.Basic);
        printerTest.getEndString(101, new AmericanCurrency(), Mode.Basic);
        printerTest.getEndString(121, new AmericanCurrency(), Mode.Basic);

        printerTest = new PrinterTest("доллара ");
        printerTest.getEndString(2, new AmericanCurrency(), Mode.Basic);
        printerTest.getEndString(23, new AmericanCurrency(), Mode.Basic);
        printerTest.getEndString(102, new AmericanCurrency(), Mode.Basic);
        printerTest.getEndString(122, new AmericanCurrency(), Mode.Basic);

        printerTest = new PrinterTest("долларов ");
        printerTest.getEndString(5, new AmericanCurrency(), Mode.Basic);
        printerTest.getEndString(11, new AmericanCurrency(), Mode.Basic);
        printerTest.getEndString(12, new AmericanCurrency(), Mode.Basic);
        printerTest.getEndString(20, new AmericanCurrency(), Mode.Basic);
        printerTest.getEndString(25, new AmericanCurrency(), Mode.Basic);
        printerTest.getEndString(30, new AmericanCurrency(), Mode.Basic);
        printerTest.getEndString(100, new AmericanCurrency(), Mode.Basic);
        printerTest.getEndString(105, new AmericanCurrency(), Mode.Basic);
        printerTest.getEndString(110, new AmericanCurrency(), Mode.Basic);
        printerTest.getEndString(111, new AmericanCurrency(), Mode.Basic);
        printerTest.getEndString(112, new AmericanCurrency(), Mode.Basic);
        printerTest.getEndString(115, new AmericanCurrency(), Mode.Basic);
        printerTest.getEndString(120, new AmericanCurrency(), Mode.Basic);
        printerTest.getEndString(125, new AmericanCurrency(), Mode.Basic);


        ILogic logicTest = new LogicTest("один рубль десять копеек ", new RussianCurrency());
        logicTest.getString(1.1);

        logicTest = new LogicTest("двадцать один рубль двадцать одна копейка ", new RussianCurrency());
        logicTest.getString(21.21);

        logicTest = new LogicTest("сто один рубль одна копейка ", new RussianCurrency());
        logicTest.getString(101.01);

        logicTest = new LogicTest("сто двадцать один рубль двадцать одна копейка ", new RussianCurrency());
        logicTest.getString(121.21);

        logicTest = new LogicTest("два рубля две копейки ", new RussianCurrency());
        logicTest.getString(2.02);

        logicTest = new LogicTest("двадцать три рубля двадцать три копейки ", new RussianCurrency());
        logicTest.getString(23.23);

        logicTest = new LogicTest("сто два рубля две копейки ", new RussianCurrency());
        logicTest.getString(102.02);

        logicTest = new LogicTest("сто двадцать два рубля двадцать две копейки ", new RussianCurrency());
        logicTest.getString(122.22);

        logicTest = new LogicTest("пять рублей пять копеек ", new RussianCurrency());
        logicTest.getString(5.05);

        logicTest = new LogicTest("одиннадцать рублей одиннадцать копеек ", new RussianCurrency());
        logicTest.getString(11.11);

        logicTest = new LogicTest("двенадцать рублей двенадцать копеек ", new RussianCurrency());
        logicTest.getString(12.12);

        logicTest = new LogicTest("двадцать рублей двадцать копеек ", new RussianCurrency());
        logicTest.getString(20.20);

        logicTest = new LogicTest("двадцать пять рублей двадцать пять копеек ", new RussianCurrency());
        logicTest.getString(25.25);

        logicTest = new LogicTest("тридцать рублей тридцать копеек ", new RussianCurrency());
        logicTest.getString(30.30);

        logicTest = new LogicTest("сто рублей ", new RussianCurrency());
        logicTest.getString(100.00);

        logicTest = new LogicTest("сто пять рублей пять копеек ", new RussianCurrency());
        logicTest.getString(105.05);

        logicTest = new LogicTest("сто десять рублей десять копеек ", new RussianCurrency());
        logicTest.getString(110.10);

        logicTest = new LogicTest("сто одиннадцать рублей одиннадцать копеек ", new RussianCurrency());
        logicTest.getString(111.11);

        logicTest = new LogicTest("сто двенадцать рублей двенадцать копеек ", new RussianCurrency());
        logicTest.getString(112.12);

        logicTest = new LogicTest("сто пятнадцать рублей пятнадцать копеек ", new RussianCurrency());
        logicTest.getString(115.15);

        logicTest = new LogicTest("сто двадцать рублей двадцать копеек ", new RussianCurrency());
        logicTest.getString(120.20);

        logicTest = new LogicTest("сто двадцать пять рублей двадцать пять копеек ", new RussianCurrency());
        logicTest.getString(125.25);

        logicTest = new LogicTest("сто двадцать пять рублей двадцать пять копеек ", new RussianCurrency());
        logicTest.getString(125.25);


        logicTest = new LogicTest("один доллар десять центов ", new AmericanCurrency());
        logicTest.getString(1.1);

        logicTest = new LogicTest("двадцать один доллар двадцать один цент ", new AmericanCurrency());
        logicTest.getString(21.21);

        logicTest = new LogicTest("сто один доллар один цент ", new AmericanCurrency());
        logicTest.getString(101.01);

        logicTest = new LogicTest("сто двадцать один доллар двадцать один цент ", new AmericanCurrency());
        logicTest.getString(121.21);

        logicTest = new LogicTest("два доллара два цента ", new AmericanCurrency());
        logicTest.getString(2.02);

        logicTest = new LogicTest("двадцать три доллара двадцать три цента ", new AmericanCurrency());
        logicTest.getString(23.23);

        logicTest = new LogicTest("сто два доллара два цента ", new AmericanCurrency());
        logicTest.getString(102.02);

        logicTest = new LogicTest("сто двадцать два доллара двадцать два цента ", new AmericanCurrency());
        logicTest.getString(122.22);

        logicTest = new LogicTest("пять долларов пять центов ", new AmericanCurrency());
        logicTest.getString(5.05);

        logicTest = new LogicTest("одиннадцать долларов одиннадцать центов ", new AmericanCurrency());
        logicTest.getString(11.11);

        logicTest = new LogicTest("двенадцать долларов двенадцать центов ", new AmericanCurrency());
        logicTest.getString(12.12);

        logicTest = new LogicTest("двадцать долларов двадцать центов ", new AmericanCurrency());
        logicTest.getString(20.20);

        logicTest = new LogicTest("двадцать пять долларов двадцать пять центов ", new AmericanCurrency());
        logicTest.getString(25.25);

        logicTest = new LogicTest("тридцать долларов тридцать центов ", new AmericanCurrency());
        logicTest.getString(30.30);

        logicTest = new LogicTest("сто долларов ", new AmericanCurrency());
        logicTest.getString(100.00);

        logicTest = new LogicTest("сто пять долларов пять центов ", new AmericanCurrency());
        logicTest.getString(105.05);

        logicTest = new LogicTest("сто десять долларов десять центов ", new AmericanCurrency());
        logicTest.getString(110.10);

        logicTest = new LogicTest("сто одиннадцать долларов одиннадцать центов ", new AmericanCurrency());
        logicTest.getString(111.11);

        logicTest = new LogicTest("сто двенадцать долларов двенадцать центов ", new AmericanCurrency());
        logicTest.getString(112.12);

        logicTest = new LogicTest("сто пятнадцать долларов пятнадцать центов ", new AmericanCurrency());
        logicTest.getString(115.15);

        logicTest = new LogicTest("сто двадцать долларов двадцать центов ", new AmericanCurrency());
        logicTest.getString(120.20);

        logicTest = new LogicTest("сто двадцать пять долларов двадцать пять центов ", new AmericanCurrency());
        logicTest.getString(125.25);

    }
}
