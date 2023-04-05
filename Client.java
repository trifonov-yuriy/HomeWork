import java.util.ArrayList;
import java.util.List;

public class Client
{
    private int idClient; //id клиента
    private String name; //Имя клиента
    private int age; //Возраст
    private ArrayList<Integer> accountIdList; //Список id счетов клиента

    public Client(String name, int age, String numberOfPassport)
    {
        this.name = name;
        this.age = age;
        idClient = numberOfPassport.hashCode();
        accountIdList = new ArrayList<>();
    }

    public int getIdClient()
    {
        return idClient;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public ArrayList<Integer> getAccountIdList()
    {
        return accountIdList;
    }

}
