package tests.unit;

import assertions.Assertions;
import myProject.logicService.ILogic;
import myProject.logicService.Logic;

public class LogicTest implements ILogic
{
    private String expectedString;
    private int expectedInt;

    public LogicTest(String expectedString, int expectedInt)
    {
        this.expectedString = expectedString;
        this.expectedInt = expectedInt;
    }

    public String getString(int digit)
    {
        String text = "";
        try
        {
            text = new Logic().getString(digit);
            Assertions.assertEquals(expectedString, text);
            System.out.println(String.format("LogicTest.getString(%s) пройден", digit));
            return "success";
        }
        catch (AssertionError e)
        {
            System.err.println(String.format("LogicTest.getString(%s) не пройден: %s", digit, e.getMessage()));
            return "error!";
        }

    }

    public int remainderOfDivision(int digit)
    {
        int value;
        try
        {
            value = new Logic().remainderOfDivision(digit);
            Assertions.assertEquals(expectedInt, value);
            System.out.println(String.format("LogicTest.remainderOfDivision(%s) пройден", digit));
            return 0;
        }
        catch (AssertionError e)
        {
            System.err.println(String.format("LogicTest.remainderOfDivision(%s) не пройден: %s", digit, e.getMessage()));
            return -1;
        }

    }



}
