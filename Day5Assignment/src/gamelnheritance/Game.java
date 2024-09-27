package gamelnheritance;

public class Game {
    private String name;
    private int maxNumPlayers;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxNumPlayers() {
        return maxNumPlayers;
    }

    public void setMaxNumPlayers(int maxNumPlayers) {
        this.maxNumPlayers = maxNumPlayers;
    }

    @Override
    public String toString() {
        return String.format("Maximum number of players for %s is %d", name, maxNumPlayers);
    }
}
