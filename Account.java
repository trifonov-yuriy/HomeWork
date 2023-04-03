public class Account
{
    private int accountId; //id счета
    private int countGoldMonet; //Количество золотых монет
    private int idClient; //id клиента

    public Account(int countGoldMonet, int idClient)
    {
        accountId = System.identityHashCode(this);
        this.countGoldMonet = countGoldMonet;
        this.idClient = idClient;
    }
    public int getCountGoldMonet()
    {
        return countGoldMonet;
    }

    public int getIdClient()
    {
        return idClient;
    }

    public  int getAccountId()
    {
        return accountId;
    }


}
