// Обобщенный абстрактный класс
package units;


public abstract class Man implements GameInterface {
    @Override
    public String getInfo() {
        return "";
    }


    @Override
    public void step(int a) {
        
    }

    protected int attack, defence, damage, hp, speed;
    
    public Man(int attack, int defence, int hp, int speed) {
        this.attack = attack;
        this.defence = defence;
        this.hp = hp;
        this.speed = speed;
    }


    public Man(int attack, int defence, int damage, int hp, int speed) {
        this.attack = attack;
        this.defence = defence;
        this.damage = damage;
        this.hp = hp;
        this.speed = speed;
    }

    void Attack(){
        System.out.println("Иду на Вы");
    }

    public int getHp() {
        return hp;
    }

    public int getDefence() {
        return defence;
    }

    public int getAttack() {
        return attack;
    }

    public int getSpeed() {
        return speed;
    }


    public int getDamage() {
        return damage;
    }

    

}