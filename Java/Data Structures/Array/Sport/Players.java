import java.util.ArrayList;

class Players {
    private final ArrayList<Integer> players;

    public Players() {
        players = new ArrayList<>();
    }

    public void insert(int value) {
        players.add(value);
    }

    public int numOfPlayers() {
        return players.size();
    }

    public void display() {
        System.out.println(players);
    }
}

