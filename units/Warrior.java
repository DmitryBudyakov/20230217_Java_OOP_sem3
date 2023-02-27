package units;

public class Warrior extends Man {

    protected int minDamage;
    protected int maxDamage;

    public Warrior(int attack, int defence, int hp, int speed, int minDamage, int maxDamage) {
        super(attack, defence, hp, speed);
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
    }

    @Override
    public String getInfo() {
        return "";
    }

    @Override
    public void step(int a) {
        // super.step(a);
    }

    public int getMinDamage() {
        return minDamage;
    }

    public int getMaxDamage() {
        return maxDamage;
    }

}
