package weapons;

import Interfaces.IWeapon;

public enum Attack {
    SWORD(5),
    CLUB(10),
    AXE(15);

    private final int damageValue;

    Attack(int value){
        this.damageValue = value;
    }

    public int getValue() {
        return damageValue;
    }

}
