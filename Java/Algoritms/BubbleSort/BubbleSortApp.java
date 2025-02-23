class BubbleSortApp
{
    public static void main(String[] args)
    {
        int size = 100;
        BubbleSort sort = new BubbleSort(size);

        sort.insert(77);
        sort.insert(99);
        sort.insert(44);
        sort.insert(55);
        sort.insert(22);
        sort.insert(88);
        sort.insert(88);
        sort.insert(11);
        sort.insert(66);
        sort.insert(33);

        sort.display();

        sort.bubbleSort();

        sort.display();
    }
}