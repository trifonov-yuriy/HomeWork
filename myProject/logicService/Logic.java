package myProject.logicService;
import myProject.currencyService.Mode;
import myProject.currencyService.RussianCurrency;
import myProject.inputOutputService.IPrinter;
import myProject.inputOutputService.Printer;
import myProject.stringConvertService.*;
import myProject.currencyService.Currency;
import java.util.ArrayList;
import java.util.List;

public class Logic implements ILogic
{
    private Currency currency;

    public Logic(Currency currency)
    {
        this.currency = currency;
    }

    private List<Integer> breakIntoGroups(int digit) //Разбиваем число на группы. Максимум 3 числа в группе.
    {
        List<Integer> groupList = new ArrayList<>();
        int value = digit;
        do
        {
            groupList.add(value % 1000);
            value = value / 1000;
        }
        while(value > 0);
        return groupList;

    }

    private int remainderOfDivision(int digit)
    {
        int value = digit % 100;
        if(value >= 20)
        {
            value = value % 10;
        }
        return value;
    }

    private String toString(int groupOfDigits, int groupNumber)
    {
        String myString = groupToString(groupOfDigits, groupNumber);

        myString += addition(groupOfDigits, groupNumber);

        return myString;
    }

    private String addition(int groupOfDigits, int groupNumber) //Добавка в конце миллиарды, миллионы, тысячи
    {
        StringConverter stringConverter = null;
        int value;
        String myString = "";
        if(groupOfDigits != 0) {
            switch (groupNumber) {
                case 1: {
                    stringConverter = new ThousandsStringConverter();
                }
                break;
                case 2: {
                    stringConverter = new MillionsStringConverter();
                }
                break;
                case 3: {
                    stringConverter = new BillionsStringConverter();
                }
                break;
            }
        }

        value = remainderOfDivision(groupOfDigits);
        if(stringConverter != null) {
            if (value == 0 || (value >= 5 && value <= 19)) {
                myString += stringConverter.getString1();
            }
            if (value == 1) {
                myString += stringConverter.getString2();
            }
            if (value >= 2 && value <= 4) {
                myString += stringConverter.getString3();
            }
        }

        return myString;
    }
    private String groupToString(int groupOfDigits, int groupNumber)
    {
        String myString = "";
        int value = groupOfDigits / 100;

        myString += HundredsStringConverter.getString(value);

        value = (groupOfDigits / 10) % 10;
        if(value == 1)
        {
            value = groupOfDigits % 100;
        }
        myString += TensStringConverter.getString(value);


        if((value >= 0 && value < 10) || (value >= 20))
        {
            value = groupOfDigits % 10;
            if((value == 1 || value == 2) && groupNumber == 1)
            {
                value = value * 1000;
            }
            myString += UnitsStringConverter.getString(value);
        }

        return myString;
    }

    private String digitBasicToString(int digit)
    {
        String myString = "";
        List<Integer> groupList = breakIntoGroups(digit); //Получаем группы чисел. В группе по 3 числа
        if (groupList.size() == 1 && groupList.get(0) == 0)
        {
            return "ноль ";
        }

        for (int i = groupList.size() - 1; i >= 0; i--)
        {
            myString += toString(groupList.get(i), i);
        }

        return myString;
    }

    private String digitAdditionalToString(int digit)
    {
        String myString = "";

        int value = (digit / 10);
        if(value == 1)
        {
            value = digit % 100;
        }
        myString += TensStringConverter.getString(value);

        value = digit % 100;

        if((value >= 0 && value < 10) || (value >= 20))
        {
            value = digit % 10;
            if((value == 1 || value == 2) && currency instanceof RussianCurrency)
            {
                value = value * 1000;
            }
            myString += UnitsStringConverter.getString(value);
        }


        return myString;
    }

    public String getString(double digit)
    {
        String myString = "";
        int value = (int) (digit * 100);
        int digitBasic = (value / 100); //Рубли, фунты, доллары
        int digitAdditional = (value % 100); //Копейки, пенсы, центы
        myString += digitBasicToString(digitBasic);
        IPrinter printer = new Printer();
        myString += printer.getEndString(remainderOfDivision(digitBasic), currency, Mode.Basic);


        if(digitAdditional != 0)
        {
            myString += digitAdditionalToString(digitAdditional);
            myString += printer.getEndString(remainderOfDivision(digitAdditional), currency, Mode.Additional);
        }
        return myString;

    }


}
