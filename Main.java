import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
import java.util.Collections;

public class Main
{
    private static ArrayList<Integer> initArrayList(int listLength, SortOrder sortOrder)
    {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
            System.out.println("Список проинициализирован");
            if(sortOrder == SortOrder.SORT_IN_ASCENDING_ORDER)
            {
                for (int i = listLength - 1; i >= 0; i--)
                {
                    int j = (listLength - 1) - i;
                    arrayList.add(i);
                    if (listLength < 100) {
                        System.out.print(arrayList.get(j) + "\t");
                    }
                }
            }
            else if(sortOrder == SortOrder.SORT_IN_DESCENDING_ORDER)
            {
                for (int i = 0; i < listLength; i++)
                {
                    arrayList.add(i);
                    if (listLength < 100) {
                        System.out.print(arrayList.get(i) + "\t");
                    }
                }
            }
            System.out.println();

        return arrayList;
    }


    private static void sortList(ArrayList<Integer> arrayList, SortMethod sortMethod, SortOrder sortOrder)
    {
        ArrayList<Integer> sortedList = new ArrayList<Integer>(); //Отсортированный список

        long startTime = System.nanoTime();
        ISortList sortList = new SortByMergeMethod(); //Метод по умолчанию (слиянием)

        if(sortMethod == SortMethod.SORT_BY_MERGE_METHOD)
        {
            sortList = new SortByMergeMethod();
        }

        else if(sortMethod == SortMethod.SORT_BY_INSERTION_METHOD)
        {
            sortList = new SortByInsertionMethod();
        }

        if(sortOrder == SortOrder.SORT_IN_ASCENDING_ORDER)
        {
            sortedList = sortList.sortInAscendingOrder(arrayList);
        }

        else if(sortOrder == SortOrder.SORT_IN_DESCENDING_ORDER)
        {
            sortedList = sortList.sortInDescendingOrder(arrayList);
        }

        long finishTime = System.nanoTime();

        System.out.println("Массив отсортирован");
        if(sortedList.size() < 100)
        {
            for (Integer integer : sortedList) {
                System.out.print(integer + "\t");
            }
        }

        System.out.println("\nВремя выполнения алгоритма: " + (finishTime - startTime)/1000 + " мкс");

    }

    public static void useCollectionSortMethod (int listLength)
    {
        ArrayList<Integer> arrayList = initArrayList(listLength, SortOrder.SORT_IN_ASCENDING_ORDER);
        System.out.println("Сортировка методом Collection.Sort");

        long startTime = System.nanoTime();
        Collections.sort(arrayList);
        long finishTime = System.nanoTime();

        if(arrayList.size() < 100)
        {
            for (Integer integer : arrayList) {
                System.out.print(integer + "\t");
            }
        }
        System.out.println("\nВремя выполнения алгоритма: " + (finishTime - startTime)/1000 + " мкс");
    }


    public static void main(String[] args)
    {
        for(int i = 10; i < 500; i += 10)
        {
            System.out.println("########################################################\nКоличество элементов: " + i);
            System.out.println("_________________________________________\nСортировка методом слияния");
            ArrayList<Integer> arrayList = initArrayList(i, SortOrder.SORT_IN_ASCENDING_ORDER);
            sortList(arrayList, SortMethod.SORT_BY_MERGE_METHOD, SortOrder.SORT_IN_ASCENDING_ORDER);
            System.out.println("\nСортировка методом слияния закончена\n_________________________________________\n\n\n\n");


            System.out.println("_________________________________________\nСортировка методом вставок");
            arrayList = initArrayList(i, SortOrder.SORT_IN_ASCENDING_ORDER);
            sortList(arrayList, SortMethod.SORT_BY_INSERTION_METHOD, SortOrder.SORT_IN_ASCENDING_ORDER);
            System.out.println("\nСортировка методом вставок закончена\n_________________________________________\n\n\n\n");


            System.out.println("_________________________________________\nСортировка с использованием метода Collection.Sort");
            useCollectionSortMethod(i);
            System.out.println("\nСортировка с использованием метода Collection.Sort закончена\n_________________________________________");
            System.out.println("###########################################################################\n\n\n\n");
        }

    }
}
