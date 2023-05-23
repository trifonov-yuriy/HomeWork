package myProject.currencyService;

public class RussianCurrency implements Currency
{
    public String getStringBasic(int value)
    {
        if(value == 0 || (value >= 5 && value <= 20))
        {
            return "рублей ";
        }
        if(value == 1)
        {
            return "рубль ";
        }
        if(value >= 2 && value <= 4)
        {
            return "рубля ";
        }
        return "";
    }

    public String getStringAdditional(int value)
    {
        if(value == 0 || (value >= 5 && value <= 20))
        {
            return "копеек ";
        }
        if(value == 1)
        {
            return "копейка ";
        }
        if(value >= 2 && value <= 4)
        {
            return "копейки ";
        }

        return "";

    }



}
