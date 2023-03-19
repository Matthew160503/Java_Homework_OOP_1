package Units;

import java.util.ArrayList;
import java.util.Random;
 
public abstract class BaseHero implements Interface{
    protected static int number;
    protected static Random r;

    protected String name;
    protected int hp;
    protected int maxHp;
    protected int damage;
    protected int speed;

    static {
        BaseHero.number = 0;
        BaseHero.r = new Random();
    }

/**
 * @param name Имя персонажа
 * @param hp Жизни персонажа
 * @param damage Урон персонажа
 */    
    public BaseHero(String name, int hp, int damage, int speed) {
        this.name = name;
        this.hp = hp;
        this.maxHp = hp;
        this.damage = damage;
        this.speed = speed;
    }

    @Override
    public String getInfo() {
        return String.format("Name: %s  Hp: %d  Damage: %d  Type: %s  Speed: %d",
                this.name, this.hp, this.damage, this.getClass().getSimpleName(), this.speed);
    }

    

    @Override
    public String toString() {
        return String.format("%s",this.name);
    }

    @Override
    public void step(ArrayList<BaseHero> team,ArrayList<BaseHero> ourTeam) {
        System.out.println("Шаг");
    }

    public int getSpeed() {
        return speed;
    }
    public String getName(){
        return name;
    }

    public void attack(BaseHero target, int damage){
        int causeDamage = damage;
        System.out.printf("%s атакует %s\t", this.getName(), target.getName());
        System.out.printf("Сила атаки равна %d\t", causeDamage);
        target.getDamage(causeDamage);
    }

    public void getDamage(int damage){
        if(this.hp - damage > 0){
            this.hp -= damage;
            System.out.printf("Оставшиеся жизни %d\n", this.hp);
        }
        else{
            this.hp = 0;
            System.out.printf("%s убит\n", this.name); 
        }
    }

}
