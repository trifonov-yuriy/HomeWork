package myProject.currencyService;

public class RussianCurrency implements Currency
{
    public String getString(int value)
    {
        if(value == 0 || (value >= 5 && value <= 20))
        {
            return "рублей";
        }
        if(value == 1)
        {
            return "рубль";
        }
        if(value >= 2 && value <= 4)
        {
            return "рубля";
        }
        return "";

    }



}
