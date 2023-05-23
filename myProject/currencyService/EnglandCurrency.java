package myProject.currencyService;

public class EnglandCurrency implements Currency
{
    public String getStringBasic(int value)
    {
        if(value == 0 || (value >= 5 && value <= 20))
        {
            return "фунтов ";
        }
        if(value == 1)
        {
            return "фунт ";
        }
        if(value >= 2 && value <= 4)
        {
            return "фунта ";
        }
        return "";

    }

    public String getStringAdditional(int value)
    {
        if(value == 0 || (value >= 5 && value <= 20))
        {
            return "пенсов ";
        }
        if(value == 1)
        {
            return "пенс ";
        }
        if(value >= 2 && value <= 4)
        {
            return "пенса ";
        }
        return "";

    }
}
