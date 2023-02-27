package units;

public class Healer extends Man {

    protected int magic;

    public Healer(int attack, int defence, int damage, int hp, int speed, int magic) {
        super(attack, defence, damage, hp, speed);
        this.magic = magic;
    }

    public int getMagic() {
        return magic;
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
