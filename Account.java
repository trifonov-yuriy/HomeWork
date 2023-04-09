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
        try
        {
            Account myObj = (Account) obj;
            return id == obj.hashCode() && countGoldMonet == myObj.getCountGoldMonet();
        }
        catch (Exception e)
        {
            return false;
        }
    }

}
