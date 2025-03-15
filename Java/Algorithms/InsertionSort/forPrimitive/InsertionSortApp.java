class InsertionSortApp
{
    public static void main(String[] args) 
    {
        int size = 100;
        InsertionSort sort = new InsertionSort(size);  

        sort.insert(77);  
        sort.insert(22);  
        sort.insert(99);  
        sort.insert(11);  
        sort.insert(66);  
        sort.insert(33);  
        sort.insert(88);  
        sort.insert(44);  
        sort.insert(00);  

        sort.display();

        sort.insertionSort();

        sort.display();
    }
}