import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;


public class Main {
    private static void doMathOperation(MathOperations mathOperations, Numbers numbers)  throws MathOperationException
    {
        int c;
        int d;
        switch(mathOperations.getOperation1())
        {
            case "plus" :
            {
                c = numbers.getValue1() + numbers.getValue2();
            } break;
            case "minus" :
            {
                c = numbers.getValue1() - numbers.getValue2();
            } break;
            default :
            {
                throw new MathOperationException("Операция не найдена");
            }
        }

        if(c < 0)
        {
            throw new MathOperationRuntimeException("Отрицительный результат не допускается");
        }


        switch(mathOperations.getOperation2())
        {
            case "multiplication" :
            {
                d = numbers.getValue3() * numbers.getValue4();
            } break;
            case "division":
            {
                if(numbers.getValue4() == 0)
                {
                    throw new MathOperationRuntimeException("Попытка деления на 0!");
                }
                d = numbers.getValue3() / numbers.getValue4();
            } break;
            default :
            {
                throw new MathOperationException("Операция не найдена");
            }
        }

        if(d < 0)
        {
            throw new MathOperationRuntimeException("Отрицательный результат не допускается");
        }

    }


    private static String readTextFromFile(String pathToFile)
    {
        FileReader fileReader = new FileReader();
        String textFromFile = null;
        try
        {
            textFromFile = fileReader.getTextFromFile(pathToFile);
            return textFromFile;
        }
        catch(IOException e)
        {
            System.out.println("Возникла ошибка при чтении файл или файл не найден!");
            return e.getMessage();
        }
        catch(FileNameIsNotCorrectException e)
        {
            System.out.println("Ошибка в названии файла!");
            return e.getMessage();
        }
    }

    private static <T> T getObject (Class<T> valueType, String jsonString, ObjectMapper objectMapper)
    {
        try
        {
            T object = new JsonDeserialize<T>().jsonDeserialize(jsonString, valueType, objectMapper);
            return object;
        }
        catch(JsonProcessingException e)
        {
            throw new RuntimeException("Ошибка десериализации!");
        }
    }

    public static void main(String args[])
    {
        ObjectMapper objectMapper = new ObjectMapper();
        String numbersString = readTextFromFile("myFile.txt");
        Numbers numbers = getObject(Numbers.class, numbersString, objectMapper);

        String mathOperationsString= readTextFromFile("myFile1.txt");
        MathOperations mathOperations = getObject(MathOperations.class, mathOperationsString, objectMapper);

        try
        {
            doMathOperation(mathOperations, numbers);
        }
        catch (MathOperationException e)
        {
            System.out.println(e.getMessage());
        }

    }



}