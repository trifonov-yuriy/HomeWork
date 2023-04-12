import java.util.*;

public class Main {

    private static HashMap<Integer, Client> myClients = new HashMap<>();
    private static List<Account> myAccounts = new ArrayList<>();

    private static Map<Client, List<Account>> accounts = new HashMap<>(); //Счета

    private static Map<Account, Client> clients = new HashMap<>(); //Клиенты



    private static void initClient(String name, int age) //Инициализация клиента
    {
        Client client = new Client(name, age);
        accounts.put(client, new ArrayList<>());
        myClients.put(client.getName().hashCode() + client.getAge(), client);
    }

    private static Client getMyClient(String name, int age)
    {
        return myClients.get(name.hashCode() + age);
    }

    private static void initAccount(int countGoldMonet, Client client) //Инициализация счета
    {
        if(client != null)
        {
            Account account = new Account(countGoldMonet);
            clients.put(account, client);

            List<Account> accountList = accounts.get(client);
            accountList.add(account);
            myAccounts.add(account);
        }
    }

    private static Account getMyAccount(int index)
    {
        try
        {
            return myAccounts.get(index);
        }
        catch(Exception e)
        {
            return null;
        }
    }


    private static void initClients() //Инициализация клиента
    {
        //Клиент №1
        initClient("Ivan", 25);

        //Клиент №1
        initClient("Ivan", 25);

        //Клиент №2
        initClient("Petr", 45);

        //Клиент №3
        initClient("Dmitriy", 18);

    }

    private static void initAccounts() //Инициализация счета
    {
        //Счета на клиента Ivan
        initAccount(50, getMyClient("Ivan", 25));
        initAccount(520, getMyClient("Ivan", 25));
        initAccount(560, getMyClient("Ivan", 25));
        initAccount(20, getMyClient("Ivan", 25));

        //Счет на клиента Petr
        initAccount(40, getMyClient("Petr", 45));
        initAccount(420, getMyClient("Petr", 45));
        initAccount(260, getMyClient("Petr", 45));
        initAccount(10, getMyClient("Petr", 45));

        //Счет на клиента Dmitriy
        initAccount(140, getMyClient("Dmitriy", 18));
        initAccount(4120, getMyClient("Dmitriy", 18));
        initAccount(2160, getMyClient("Dmitriy", 18));
        initAccount(110, getMyClient("Dmitriy", 18));

    }

    private static List<Account> findAccountsByClient(Client client) //Найти счета по клиенту
    {
        System.out.println("\n\n\nПоиск счетов по клиенту");
        List<Account> accountList = null;
        if(client != null)
        {
            accountList = accounts.get(client);
            System.out.println("Клиент: " + client.getName());
            System.out.println("Возраст: " + client.getAge());
            System.out.println("Счета клиента: ");
            int i = 1;
            for(Account account : accountList)
            {
                System.out.println("Счет №" + i);
                System.out.println("Количество монет: " + account.getCountGoldMonet());
                i++;
            }
        }

        return accountList;
    }

    private static Client findClientByAccount(Account account) //Поиск клиента по счету
    {
        System.out.println("\n\n\nПоиск клиента по счету");
        if(account != null)
        {
            System.out.println("Количество монет: " + account.getCountGoldMonet());
            return clients.get(account);
        }
        return null;
    }

    private static void printInfoAboutClient(Client client)
    {
        System.out.println("Клиент: " + client.getName());
        System.out.println("Возраст: " + client.getAge());
    }

    public static void main(String[] args)
    {
        initClients();
        initAccounts();

        //Поиск счетов по клиентам
        Client client = getMyClient("Ivan", 25);
        List<Account> accountArrayList = findAccountsByClient(client);

        client = getMyClient("Petr", 45);
        accountArrayList = findAccountsByClient(client);

        client = getMyClient("Dmitriy", 18);
        accountArrayList = findAccountsByClient(client);


        //Поиск клиента по счету
        Account account = getMyAccount(55);
        Client findClient = findClientByAccount(account);
        if(findClient != null)
        {
            printInfoAboutClient(findClient);
        }


        Account ac = new Account(100);
        ac.equals(null);
    }
}