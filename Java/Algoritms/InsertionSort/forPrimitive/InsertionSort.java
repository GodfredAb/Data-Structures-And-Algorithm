public class InsertionSort 
{
    private long[] a;
    private int nElems;

    public InsertionSort(int size)
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

    public void insertionSort()
    {
        int out, in;
        for(out = 1; out < nElems; out++)
        {
            long current = a[out];
            in = out;
            while(in > 0 && a[in - 1] > current)
            {    a[in] = a[in - 1];
                 --in;               
            }
            a[in] = current;
        }
    }
}