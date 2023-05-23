import myProject.IStarter;
import myProject.Starter;

import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args)
    {
        IStarter starter = new Starter();
        try
        {
            starter.start("ru");
        }
        catch (NullPointerException e)
        {
            System.err.println(e.getMessage());
        }
    }
}