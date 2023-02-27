package units;

/**
 * Archer
 */
public class Archer extends Man {

    protected int shoots;
    protected int minDamage;
    protected int maxDamage;

    public Archer(int attack, int defence, int hp, int speed, int shoots, int minDamage,
            int maxDamage) {
        super(attack, defence, hp, speed);
        this.shoots = shoots;
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
    }

    public int getShoots() {
        return shoots;
    }

    public int getMinDamage() {
        return minDamage;
    }

    public int getMaxDamage() {
        return maxDamage;
    }

    @Override
    public String getInfo() {
        return "";
    }

    @Override
    public void step(int a) {
        // super.step(a);
    }

    
}