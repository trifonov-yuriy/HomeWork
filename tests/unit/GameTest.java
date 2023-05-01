package tests.unit;

import assertions.Assertions;
import game.*;

import java.util.Random;

public class GameTest
{
    private final DiceImplTest diceImplTest;
    private final GameWinnerPrinter winnerPrinter;

    public GameTest(DiceImplTest diceImplTest, GameWinnerPrinter winnerPrinter)
    {
        this.diceImplTest = diceImplTest;
        this.winnerPrinter = winnerPrinter;
    }
    public void testPlayGameForDiceNull()
    {
        String scenario = "Тест на метод Game.playGame() при Dice = null";
        Game game = new Game(null, new GameWinnerConsolePrinter());
        try
        {
            game.playGame(new Player("Игорь"), new Player("Вася"));
            System.out.println(String.format("%s пройден", scenario));
        }
        catch (NullPointerException e)
        {
            System.err.println(String.format("%s не пройден: %s", scenario, e.getMessage()));
        }

    }

    public void testPlayGameForGameWinnerPrinterNull()
    {
        String scenario = "Тест на метод Game.playGame() при GameWinnerPrinter = null";
        Game game = new Game(new DiceImpl(), null);
        try
        {
            game.playGame(new Player("Игорь"), new Player("Вася"));
            System.out.println(String.format("%s пройден", scenario));
        }
        catch (NullPointerException e)
        {
            System.err.println(String.format("%s не пройден: %s", scenario, e.getMessage()));
        }
    }

    public void testGameWinnerConsolePrinterForPlayerNull()
    {
        String scenario = "Тест на метод GameWinnerConsolePrinter.printWinner() при player = null";
        GameWinnerPrinter gameWinnerPrinter = new GameWinnerConsolePrinter();
        try {
            gameWinnerPrinter.printWinner(null);
            System.out.println(String.format("%s пройден", scenario));
        }
        catch (NullPointerException e)
        {
            System.err.println(String.format("%s не пройден: %s", scenario, e.getMessage()));
        }
    }

    public void testPlayGameForPlayerNull(Player player1, Player player2)
    {
        String scenario = "Тест на метод Game.playGame() при player = null";
        Game game = new Game(new DiceImpl(), new GameWinnerConsolePrinter());
        try {
            game.playGame(player1, player2);
        }
        catch (NullPointerException e)
        {
            System.err.println(String.format("%s не пройден: %s", scenario, e.getMessage()));
            return;
        }

        System.out.println(String.format("%s пройден", scenario));
    }


    public void testPlayGameForPlayerResult(Player player1, Player player2)
    {
        String scenario = "Тест на метод Game.playGame() проверка, о том, что выиграл player1";
        Game game = new Game(new DiceImpl(), new GameWinnerConsolePrinterTest());
        try {
            game.playGame(player1, player2);
        }
        catch (AssertionError e)
        {
            System.err.println(String.format("%s не пройден: %s", scenario, e.getMessage()));
            return;
        }

        System.out.println(String.format("%s пройден", scenario));
    }

}
