import java.util.*;

public class Main {
    private static Map<Integer, Client> clients = new HashMap<>(); //Клиенты
    private static Map<Integer, Account> accounts = new HashMap<>(); //Счета

    private static void initClient(String name, int age, String numberOfPassport) //Инициализация клиента
    {
        Client client = new Client(name, age, numberOfPassport);
        clients.put(client.getIdClient(), client);
    }

    private static void initAccount(String numberOfClientPassport, int countGoldMonet) //Инициализация счета
    {
        Client client = clients.get(numberOfClientPassport.hashCode());
        if(client != null)
        {
            Account account = new Account(countGoldMonet, client.getIdClient());
            client.getAccountIdList().add(account.getAccountId());
            accounts.put(account.getAccountId(), account);
        }
    }


    private static void initClients() //Инициализация клиента
    {
        //Клиент №1
        initClient("Ivan", 25, "123");

        //Клиент №2
        initClient("Petr", 45, "321");

        //Клиент №3
        initClient("Dmitriy", 18, "543");

    }

    private static void initAccounts() //Инициализация счета
    {
        //Счет на клиента Ivan
        initAccount("123", 50);
        initAccount("123", 520);
        initAccount("123", 560);
        initAccount("123", 20);

        //Счет на клиента Petr
        initAccount("321", 40);
        initAccount("321", 420);
        initAccount("321", 260);
        initAccount("321", 10);

        //Счет на клиента Dmitriy
        initAccount("543", 140);
        initAccount("543", 4120);
        initAccount("543", 2160);
        initAccount("543", 110);

    }

    private static void findAccountsByClient(String numberOfPassport) //Найти счета по клиенту
    {
        System.out.println("\n\n\nПоиск счетов по клиенту");
        Client client = clients.get(numberOfPassport.hashCode());
        if(client != null)
        {
            System.out.println("Клиент: " + client.getName());
            System.out.println("Возраст: " + client.getAge());
            System.out.println("id клиента: " + client.getIdClient());
            System.out.println("Счета клиента: ");
            int i = 1;
            for(Integer accountId : client.getAccountIdList())
            {
                Account account = accounts.get(accountId);
                System.out.println("Счет №" + i);
                System.out.println("id счета: " + account.getAccountId());
                System.out.println("Количество монет: " + account.getCountGoldMonet());
                i++;
            }
        }
    }

    private static void findClientByAccount(int accountId) //Поиск клиента по счету
    {
        System.out.println("\n\n\nПоиск клиента по счету");
        Account account = accounts.get(accountId);
        if(account != null)
        {
            System.out.println("id счета: " + account.getAccountId());
            System.out.println("Количество монет: " + account.getCountGoldMonet());

            Client client = clients.get(account.getIdClient());

            if(client != null)
            {
                System.out.println("Клиент: " + client.getName());
                System.out.println("Возраст: " + client.getAge());
                System.out.println("id клиента: " + client.getIdClient());
            }

        }
    }

    public static void main(String[] args)
    {
        initClients();
        initAccounts();

        //Поиск счетов по клиентам
        findAccountsByClient("123");
        findAccountsByClient("321");
        findAccountsByClient("543");


        findClientByAccount(accounts.values().stream().findFirst().get().getAccountId());


    }
}