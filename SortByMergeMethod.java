import java.util.ArrayList;
import java.util.List;

public class SortByMergeMethod implements ISortList
{
    private final int VALUE_FOR_MERGE_METHOD = 999999;

    private ArrayList<Integer> splitList(ArrayList<Integer> arrayList, int firstIndex, int toIndex)
    {
        ArrayList<Integer> arrayListSplited = new ArrayList<Integer>();
        for(int i = firstIndex; i < toIndex  ; i++)
        {
            arrayListSplited.add(arrayList.get(i));
        }

        return  arrayListSplited;
    }

    private ArrayList<Integer> mergeAscendingOrder(ArrayList<Integer> arrayList1, ArrayList<Integer> arrayList2)
    {
        ArrayList<Integer> arrayListMerged = new ArrayList<Integer>();
        arrayList1.add(VALUE_FOR_MERGE_METHOD);
        arrayList2.add(VALUE_FOR_MERGE_METHOD);
        int j = 0;
        int i = 0;
        while((i < arrayList1.size() - 1) || j < (arrayList2.size() - 1))
        {
            if(arrayList1.get(i) > arrayList2.get(j))
            {
                arrayListMerged.add(arrayList2.get(j));
                j++;
            }
            else
            {
                arrayListMerged.add(arrayList1.get(i));
                i++;
            }

        }

        return arrayListMerged;
    }

    private ArrayList<Integer> mergeDescendingOrder(ArrayList<Integer> arrayList1, ArrayList<Integer> arrayList2)
    {
        ArrayList<Integer> arrayListMerged = new ArrayList<Integer>();
        arrayList1.add(VALUE_FOR_MERGE_METHOD * (-1));
        arrayList2.add(VALUE_FOR_MERGE_METHOD * (-1));
        int j = 0;
        int i = 0;
        while((i < arrayList1.size() - 1) || j < (arrayList2.size() - 1))
        {
            if(arrayList1.get(i) < arrayList2.get(j))
            {
                arrayListMerged.add(arrayList2.get(j));
                j++;
            }
            else
            {
                arrayListMerged.add(arrayList1.get(i));
                i++;
            }

        }

        return arrayListMerged;
    }

    private ArrayList<Integer> sortAscendingOrder(ArrayList<Integer> arrayList)
    {

        if(arrayList.size() > 1 && arrayList.get(0) > arrayList.get(1))
        {
            int value = arrayList.get(0);
            arrayList.set(0, arrayList.get(1));
            arrayList.set(1, value);
        }


        return arrayList;
    }


    private ArrayList<Integer> sortDescendingOrder(ArrayList<Integer> arrayList)
    {

        if(arrayList.size() > 1 && arrayList.get(0) < arrayList.get(1))
        {
            int value = arrayList.get(0);
            arrayList.set(0, arrayList.get(1));
            arrayList.set(1, value);
        }


        return arrayList;
    }

    public ArrayList<Integer> sortInAscendingOrder(ArrayList<Integer> arrayList)
    {
        ArrayList<Integer> arrayListMerged = new ArrayList<Integer>();
        if(arrayList.size() > 2)
        {
            ArrayList<Integer> arrayListSplited1 = splitList(arrayList, 0, arrayList.size() / 2);

            arrayListSplited1 = sortInAscendingOrder(arrayListSplited1);

            ArrayList<Integer> arrayListSplited2 = splitList(arrayList, (arrayList.size() / 2), arrayList.size());

            arrayListSplited2 = sortInAscendingOrder(arrayListSplited2);

            arrayListMerged = mergeAscendingOrder(arrayListSplited1, arrayListSplited2);
            int a = 10;
        }

        else
        {
            arrayList = sortAscendingOrder(arrayList);
            return arrayList;
        }

        return arrayListMerged;
    }

    public ArrayList<Integer> sortInDescendingOrder(ArrayList<Integer> arrayList)
    {
        ArrayList<Integer> arrayListMerged = new ArrayList<Integer>();
        if(arrayList.size() > 2)
        {
            ArrayList<Integer> arrayListSplited1 = splitList(arrayList, 0, arrayList.size() / 2);

            arrayListSplited1 = sortInDescendingOrder(arrayListSplited1);

            ArrayList<Integer> arrayListSplited2 = splitList(arrayList, (arrayList.size() / 2), arrayList.size());

            arrayListSplited2 = sortInDescendingOrder(arrayListSplited2);

            arrayListMerged = mergeDescendingOrder(arrayListSplited1, arrayListSplited2);
            int a = 10;
        }

        else
        {
            arrayList = sortDescendingOrder(arrayList);
            return arrayList;
        }

        return arrayListMerged;
    }


}
