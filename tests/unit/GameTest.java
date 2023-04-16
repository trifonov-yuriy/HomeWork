package tests.unit;

import game.*;

public class GameTest
{
    public void testGameForDiceNull()
    {
        String scenario = "Тест на метод Game.playGame()";
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

    public void testGameForWinnerPrinterNull()
    {
        String scenario = "Тест на метод Game.playGame()";
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

    public void testGameForWinnerConsolePrinterPlayerNull()
    {
        String scenario = "Тест на метод Game.playGame()";
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

}
