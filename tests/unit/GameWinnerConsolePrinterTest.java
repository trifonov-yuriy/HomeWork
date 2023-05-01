package tests.unit;

import assertions.Assertions;
import game.GameWinnerConsolePrinter;
import game.GameWinnerPrinter;
import game.Player;

public class GameWinnerConsolePrinterTest implements GameWinnerPrinter
{
    @Override
    public void printWinner(Player winner)
    {
        new GameWinnerConsolePrinter().printWinner(winner);
        Assertions.assertEquals(winner.getName(), "Игорь");

    }
}
