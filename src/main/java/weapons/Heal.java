package weapons;

public enum Heal {
    HERBS(10),
    POTIONS(20) ;

    private final int value;

    Heal(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
