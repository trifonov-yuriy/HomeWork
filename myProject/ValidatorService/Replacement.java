package myProject.ValidatorService;

public class Replacement implements Validator
{
    public String checkedDigit(String digit)
    {
        return digit.replace(',', '.');
    }
}
