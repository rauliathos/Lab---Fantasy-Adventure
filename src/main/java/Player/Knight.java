package Player;

import Interfaces.IWeapon;
import weapons.Attack;

public class Knight extends Fighter implements IWeapon{
    public Knight(String name, int healthPoints, Attack weapon) {
        super(name, healthPoints, weapon);
        this.weapon =weapon;

    }





}
