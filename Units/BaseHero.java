package Units;

import java.util.Random;
 
public abstract class BaseHero implements Interface{
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

    @Override
    public String getInfo() {
        return String.format("Name: %s  Hp: %d  Damage: %d  Type: %s",
                this.name, this.hp, this.damage, this.getClass().getSimpleName());
    }

    @Override
    public void step() {
        System.out.println("Шаг");
    }
 
}
