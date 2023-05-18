package myProject.currencyService;

public class AmericanCurrency implements Currency
{

    public String getString(int value)
    {
        if(value == 0 || (value >= 5 && value <= 20))
        {
            return "долларов";
        }
        if(value == 1)
        {
            return "доллар";
        }
        if(value >= 2 && value <= 4)
        {
            return "доллара";
        }
        return "";

    }
}
