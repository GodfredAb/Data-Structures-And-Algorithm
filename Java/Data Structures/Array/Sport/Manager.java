public class Manager {
    public static void main(String[] args) {
        Players pl = new Players();
        
        pl.insert(12);
        pl.insert(11);
        pl.insert(13);
        pl.insert(15);
        pl.insert(16);
        pl.insert(17);
        pl.insert(19);

        pl.display();

        System.out.println("Number of Players " + pl.numOfPlayers());

        pl.display();

    }
}
