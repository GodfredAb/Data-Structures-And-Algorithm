public class SelectionSort 
{
    private long[] a;
    private int nElems;

    public SelectionSort(int size)
    {
        a = new long[size];
        nElems = 0;
    }

    public void insert(long value)
    {
        a[nElems] = value;
        nElems++;
    }

    public void display()
    {
        for(int j = 0; j < nElems; j++)
            System.out.println(a[j] + " ");
        System.out.println("");
    }
    
    public void swap(int one, int two)
    {
        long temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }

    public void selectionSort()
    {
        int out, min, in;

        for(out = 0; out < nElems - 1; out++)
        {   
            min = out;
            for(in = out + 1; in < nElems; in++)
                if(a[in] < a[min])
                    min = in;
            swap(out, min);
        }
    }
}