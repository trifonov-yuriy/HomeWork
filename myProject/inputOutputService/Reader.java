package myProject.inputOutputService;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Reader implements IReader
{
    public int readFromUser()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        try
        {
            int digit = in.nextInt();
            in.close();
            return digit;
        }
        catch (InputMismatchException e)
        {
            System.out.println("Ошибка конвертации. Повторите ввод");
            return readFromUser();
        }
    }



}
