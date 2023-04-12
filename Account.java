public class Account
{
    private int id;
    private int countGoldMonet; //Количество золотых монет

    public Account(int countGoldMonet)
    {
        this.countGoldMonet = countGoldMonet;
        id = System.identityHashCode(this);
    }

    public int getCountGoldMonet()
    {
        return countGoldMonet;
    }



    @Override
    public int hashCode()
    {
        return id;
    }

    @Override
    public boolean equals(Object obj)
    {
        Account myObj = (Account) obj;
        return hashCode() == obj.hashCode() && countGoldMonet == myObj.getCountGoldMonet();
    }

}
