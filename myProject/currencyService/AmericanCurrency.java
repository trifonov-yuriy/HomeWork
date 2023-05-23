package myProject.currencyService;

public class AmericanCurrency implements Currency
{

    public String getStringBasic(int value)
    {
        if(value == 0 || (value >= 5 && value <= 20))
        {
            return "долларов ";
        }
        if(value == 1)
        {
            return "доллар ";
        }
        if(value >= 2 && value <= 4)
        {
            return "доллара ";
        }
        return "";

    }

    public String getStringAdditional(int value)
    {
        if(value == 0 || (value >= 5 && value <= 20))
        {
            return "центов ";
        }
        if(value == 1)
        {
            return "цент ";
        }
        if(value >= 2 && value <= 4)
        {
            return "цента ";
        }
        return "";

    }
}
