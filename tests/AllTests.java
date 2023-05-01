package tests;
import game.GameWinnerConsolePrinter;
import game.Player;
import tests.unit.*;

public class AllTests
{
    public static void main(String[] args)
    {
        new DiceImplTest().testRollForRange();
        GameTest gameTest = new GameTest(new DiceImplTest(), new GameWinnerConsolePrinter());
        gameTest.testPlayGameForDiceNull();
        gameTest.testPlayGameForGameWinnerPrinterNull();
        gameTest.testGameWinnerConsolePrinterForPlayerNull();
        gameTest.testPlayGameForPlayerNull(new Player("Игорь"), null);
        gameTest.testPlayGameForPlayerNull(null, new Player("Вася"));
        gameTest.testPlayGameForPlayerResult(new Player("Игорь"), new Player("Вася"));
    }

}
