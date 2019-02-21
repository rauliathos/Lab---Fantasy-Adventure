package Player;

import Interfaces.IWeapon;
import weapons.Attack;

public abstract class Fighter extends Player implements IWeapon {

    Attack weapon;

    public Fighter(String name, int healthPoints, Attack weapon) {
        super(name, healthPoints);
        this.weapon = weapon;
    }

    public Attack getWeapon() {
        return weapon;
    }

    @Override
    public int makeAttack() {
        return this.weapon.getValue();
    }




}
