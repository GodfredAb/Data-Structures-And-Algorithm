
class ArrayApp {
    public static void main(String[] args) {
        long [] arr = new long[100];
        int nElems = 0;
        int j;
        
        // insert 10 items
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = i + '0';
            nElems++;
        }

        long searchKey = 150;

        for(j = 0; j < nElems; j++)
            if(arr[j] == searchKey)
                break;
        if(j == nElems)
            System.out.println("Can't find " + searchKey);
        else
            System.out.println("Found " + searchKey);

        System.out.println(arr.length);
        
        long deleteKey = 50;

        for(j = 0; j < nElems; j++)
            if(arr[j] == deleteKey)
                break;
        
        if(j == nElems)
            System.out.println("Can't find " + deleteKey);
        else
        {
            for(int k = j; k < nElems - 1; k++)
                arr[k] = arr[k+1];
            nElems--;
        }

        for(j = 0; j < nElems; j++)
            System.out.println(arr[j] + " ");
        System.out.println("");


        System.out.println(arr.length);
    }
}