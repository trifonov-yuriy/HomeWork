package myProject.inputOutputService;

import myProject.ValidatorService.Checker;
import myProject.ValidatorService.Replacement;
import myProject.ValidatorService.Validator;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Reader implements IReader
{
    public double readFromUser()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        try
        {
            List<Validator> validatorList = new ArrayList<>();
            validatorList.add(new Checker());
            validatorList.add(new Replacement());

            String myString = in.next();
            for(Validator validator : validatorList)
            {
                myString = validator.checkedDigit(myString);
            }

            double digit = Double.parseDouble(myString);
            in.close();
            return digit;
        }
        catch (NumberFormatException e)
        {
            System.out.println("Ошибка конвертации. Повторите ввод");
            return readFromUser();
        }
    }



}
