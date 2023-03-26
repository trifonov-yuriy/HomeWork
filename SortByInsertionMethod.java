import java.util.ArrayList;

public class SortByInsertionMethod implements ISortList
{
    public ArrayList<Integer> sortInAscendingOrder(ArrayList<Integer> arrayList)
    {
        for(int k = 1; k < arrayList.size(); k++)
        {
            int i = k;
            int j = i - 1;
            while(j >= 0 && (arrayList.get(i) < arrayList.get(j)))
            {

                int value = arrayList.get(j);
                arrayList.set(j, arrayList.get(i));
                arrayList.set(i, value);
                j--;
                i--;
            }

        }
        return arrayList;
    }

    public ArrayList<Integer> sortInDescendingOrder(ArrayList<Integer> arrayList)
    {
        for(int k = 1; k < arrayList.size(); k++)
        {
            int i = k;
            int j = i - 1;
            while(j >= 0 && (arrayList.get(i) > arrayList.get(j)))
            {
                int value = arrayList.get(j);
                arrayList.set(j, arrayList.get(i));
                arrayList.set(i, value);
                j--;
                i--;
            }

        }
        return arrayList;
    }

}
