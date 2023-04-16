package tests;
import tests.unit.*;

public class AllTests
{
    public static void main(String[] args)
    {
        new DiceImplTest().rollTest();
        GameTest gameTest = new GameTest();
        gameTest.testGameForDiceNull();
        gameTest.testGameForWinnerPrinterNull();
        gameTest.testGameForWinnerConsolePrinterPlayerNull();
    }

}
