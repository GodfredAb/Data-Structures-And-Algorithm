class LowArrayApp{
    public static void main(String[] args){

        LowArray arr = new LowArray(100);

        arr.setElem(0, 77); // inserting items into the arr
        arr.setElem(1, 99);
        arr.setElem(2, 44);
        arr.setElem(3, 55);
        arr.setElem(4, 22);
        arr.setElem(5, 88);
        arr.setElem(6, 11);
        arr.setElem(7, 00);
        arr.setElem(8, 66);
        arr.setElem(9, 33);

        int nElems = 10;
        int j = 0;

        for(j = 0; j < nElems; j++) // display items in the arr
            System.out.println(arr.getElem(j) + " ");
        System.out.println("");

        int searchKey = 66;

        for(j = 0; j < nElems; j++) // searching for 66 item
            if(arr.getElem(j) == searchKey)
                break;
        if(j == nElems)
            System.out.println("Can't find " + searchKey);
        else
            System.out.println("Found " + searchKey);

        searchKey = 26;

        for(j = 0; j < nElems; j++) // deleting 26 from the arr
            if(arr.getElem(j) == searchKey)
                break;
        for(int k=j; k < nElems; k++)
            arr.setElem(k, arr.getElem(k + 1));
        nElems--;

        for(j = 0; j < nElems; j++) // display items in the arr
            System.out.println(arr.getElem(j) + " ");
        System.out.println("");
    }
}