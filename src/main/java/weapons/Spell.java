package weapons;

public enum Spell {
    FIREBALL(7),
    LIGHTNINGsTRIKE(10);

    private final int value;

    Spell(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
