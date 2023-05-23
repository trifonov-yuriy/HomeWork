package myProject.ValidatorService;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Checker implements Validator
{
    public String checkedDigit(String digit)
    {
        return digit.replaceAll("[^0-9,. ]", "").replaceAll(" +", " ").trim();
    }
}
