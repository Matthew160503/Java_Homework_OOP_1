package Units;

import java.util.Random;
 
public class BaseHero {
    protected static int number;
    protected static Random r;

    protected String name;
    protected int hp;
    protected int maxHp;
    protected int damage;

    static {
        BaseHero.number = 0;
        BaseHero.r = new Random();
    }

/**
 * @param name Имя персонажа
 * @param hp Жизни персонажа
 * @param damage Урон gthcjyf;f
 */    
    public BaseHero(String name, int hp, int damage) {
        this.name = name;
        this.hp = hp;
        this.maxHp = hp;
        this.damage = damage;
    }

    public String getInfo() {
        return String.format("Name: %s  Hp: %d  Damage: %d  Type: %s",
                this.name, this.hp, this.damage, this.getClass().getSimpleName());
    }

    public void healed(int Hp) {
        this.hp = Hp + this.hp > this.maxHp ? this.maxHp : Hp + this.hp;
    }

    public void GetDamage(int damage) {
        if (this.hp - damage > 0) {
            this.hp -= damage;
        }
        else{
            this.hp = 0;
            System.out.println("Данный персонаж умер");
        }
    }

    public void Attack(BaseHero target) {
        int allDamage;
        allDamage = this.damage;
        target.GetDamage(allDamage);
    }
}
