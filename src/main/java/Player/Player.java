package Player;

public abstract class Player {
    String name;
    int helthPoints;



    public Player(String name, int helthPoints) {
        this.name = name;
        this.helthPoints = helthPoints;
    }


    public String getName() {
        return name;
    }

    public int getHelthPoints() {
        return helthPoints;
    }
}
