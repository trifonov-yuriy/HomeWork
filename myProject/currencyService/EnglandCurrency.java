package myProject.currencyService;

public class EnglandCurrency implements Currency
{
    public String getString(int value)
    {
        if(value == 0 || (value >= 5 && value <= 20))
        {
            return "фунтов";
        }
        if(value == 1)
        {
            return "фунт";
        }
        if(value >= 2 && value <= 4)
        {
            return "фунта";
        }
        return "";

    }
}
