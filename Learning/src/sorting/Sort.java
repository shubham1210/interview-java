package sorting;

/**
 * Created by shubhamsharma on 4/6/2015.
 */
public class Sort {
    private int[] numbers;
    private int[] helper;
    private int number;

    public static void main(String[] a)
    {
        int[] input ={12,-5,22,32,0,4,66};
        selectionSort(input);
        bubbleSort(input);
        quickSort(input,0,input.length-1);
        for(int i=0;i<input.length;i++)
        {
            System.out.print(input[i] + " ");
        }
    }

    public static void bubbleSort(int[] array)
    {
        int temp;
        int finalCount=0;
        for(int i=0;i<array.length;i++)
        {
            for (int j=0;j<array.length- i -1;j++)
            {
                if(array[j+1]<array[j])
                {
                    temp = array[j+1];
                    array[j+1] =array[j];
                    array[j] = temp;
                }
            }
        }

        for(int i=0;i<array.length;i++)
        {
            System.out.print(array[i] + " ");
        }
    }

    public static void selectionSort(int[] array)
    {
        int index;
        int smallNumber;
        int finalCount=0;
        for (int i=0;i<array.length;i++)
        {
            index =i;
            for (int j=i+1;j<array.length-1;j++)
            {
                finalCount++;
                if(array[index] > array[j])
                    index =j;

            }
            smallNumber = array[index];
            array[index] = array[i];
            array[i] = smallNumber;
        }
        for(int i=0;i<array.length;i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println(finalCount);
    }

    public static void quickSort(int[] a , int start, int end)
    {
        if(start<end)
        {
            int pIndex = partionedArrayForQuickSort(a,start,end);
            quickSort(a, start, pIndex - 1);
            quickSort(a, pIndex + 1, end);
        }
    }

    public static int partionedArrayForQuickSort(int a[],int start, int end)
    {
        int pivot = a[end];
        int pIndex = start;
        int temp;
        for(int i = start;i<end;i++)
        {
            if(a[i] <= pivot)
            {
                temp = a[pIndex];
                a[pIndex] = a[i];
                a[i]=temp;
                pIndex++;
            }
        }
        temp = a[pIndex];
        a[pIndex] = a[end];
        a[end]=temp;
        return pIndex;
    }
}