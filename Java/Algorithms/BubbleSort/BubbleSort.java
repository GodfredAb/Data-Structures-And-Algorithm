public class BubbleSort 
{
    private long[] a;
    private int nElems;

    public BubbleSort(int size)
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

    public void bubbleSort()
    {
        int in, out;

        for(out = nElems - 1; out > 0; out--)
            for(in = 0; in < out; in++)
                if(a[in] > a[in + 1])
                    swap(in, in + 1);
            
    }

    public void swap(int one, int two)
    {
        long temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }
}