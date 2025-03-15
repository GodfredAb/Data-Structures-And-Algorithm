class PersonSortApp
{
    public static void main(String[] args)
    {
        int size = 100;
        PersonSort sort = new PersonSort(size);

        sort.insert("Patty", "Evans", 24);
        sort.insert("Doc", "Smith", 59);
        sort.insert("Lorraine", "Smith", 37);
        sort.insert("Tom", "Yee", 43);
        sort.insert("Sato", "Hashimoto", 21);
        sort.insert("Jose", "Velasquez", 72);
        sort.insert("Minh", "Vang", 22);
        sort.insert("Lucinda", "Cresswall", 18);
        sort.insert("Godfred", "Abora", 23);

        sort.display();

        sort.personSort();

        sort.display();

    }
}