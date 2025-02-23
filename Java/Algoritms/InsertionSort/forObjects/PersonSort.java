public class PersonSort
{
    private  Person[] a;
    private int nElems;

    public PersonSort(int size)
    {
        a = new Person[size];
        nElems = 0;
    }

    public void insert(String first, String last, int age)
    {
        a[nElems] = new Person(first, last, age);
        nElems++;
    }

    public void display()
    {
        for(int j = 0; j < nElems; j++)
            a[j].displayPerson();
        System.out.println("");
    }

    public void personSort()
    {
        int in, out;

        for(out = 1; out < nElems; out++)
        {
            Person temp  = a[out];
            in = out;
            while(in > 0 
            && a[in - 1].getLastName().compareTo(temp.getLastName()) > 0)
            {
                a[in] = a[in -1];
                --in;
            }
            a[in] = temp;
        }
    }

}