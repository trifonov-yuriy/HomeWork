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

    @Override
    public int hashCode()
    {
        return name.hashCode() + age;
    }

    @Override
    public boolean equals(Object obj)
    {
        Client client = (Client) obj;
        return name.equals(client.name) && age == client.age;
    }

}
