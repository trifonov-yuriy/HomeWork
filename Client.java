import java.util.ArrayList;
import java.util.List;

public class Client
{
    private String name; //Имя клиента
    private int age; //Возраст

    public Client(String name, int age)
    {
        this.name = name;
        this.age = age;
    }


    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

}
