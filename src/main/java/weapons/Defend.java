package weapons;

public enum Defend {
    OGRE(12),
    DRAGON(15);

    private final int value;

    Defend(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }

}
