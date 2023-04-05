import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JavaType;
import java.awt.*;
import java.io.IOException;
import java.util.Random;


public class Main {

    private static void initPerson()
    {
        try
        {
            FileReader fileReader = new FileReader();
            String textFromFile = fileReader.getTextFromFile("myFile.txt");
            Person person = new JsonDeserializeClass<Person>().jsonDeserialize(textFromFile, Person.class);

            System.out.println("Person проинициализирован: \n" +
                    "Имя: " + person.getFirstName() + "\n" +
                    "Фамилия: " + person.getLastName() + "\n" +
                    "Возраст: " + person.getAge() + "\n" +
                    "Номер телефона: " + person.getPhoneNumber() + "\n");

        }
        catch(JsonProcessingException e)
        {
            System.out.println("Ошибка десериализации: " + e.getMessage());
            e.printStackTrace();
        }
        catch(IOException e)
        {
            System.out.println("Ошибка чтения файла: " + e.getMessage());
            e.printStackTrace();
        }


    }

    private static void initBank()
    {
        try
        {
            FileReader fileReader = new FileReader();
            String textFromFile = fileReader.getTextFromFile("myFile1.txt");
            Bank bank = new JsonDeserializeClass<Bank>().jsonDeserialize(textFromFile, Bank.class);

            System.out.println("Bank проинициализирован: \n" +
                    "Адрес: " + bank.getAddress() + "\n" +
                    "Название: " + bank.getName() + "\n");
        }
        catch(JsonProcessingException e)
        {
            System.out.println("Ошибка десериализации: " + e.getMessage());
            e.printStackTrace();
        }
        catch(IOException e)
        {
            System.out.println("Ошибка чтения файла: " + e.getMessage());
            e.printStackTrace();
        }

    }


    public static void main(String[] args)
    {
        initPerson();
        initBank();

    }
}