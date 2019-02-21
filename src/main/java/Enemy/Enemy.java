package Enemy;

public abstract class Enemy {

    int healthPoints;
    int damageValue;




    public Enemy(int healthPoints, int damageValue) {
        this.healthPoints = healthPoints;
        this.damageValue = damageValue;
    }

    public int getHealthPoints() {
        return healthPoints;
    }
    public void setDamageValue(int damageValue) {
        this.damageValue = damageValue;
    }
    public int getDamageValue() {
        return  damageValue;
    }


}
