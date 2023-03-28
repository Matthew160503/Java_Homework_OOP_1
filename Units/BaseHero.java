package Units;

import java.util.ArrayList;
import java.util.Random;
 
public abstract class BaseHero implements Interface{
    protected static int number;
    protected static Random r;

    protected int attack, maxHealth, defence, supply, gangSize;
    public ArrayList<BaseHero> name;
    protected float health;
    protected int[] damage;
    protected int speed;
    protected Position position;
    public String type;

    static {
        BaseHero.number = 0;
        BaseHero.r = new Random();
    }

    public BaseHero(ArrayList<BaseHero> name, int attack, int defence, int[] damage, int maxHealth, int speed, int x, int y, int gangSize){ 
        this.attack = attack;
        this.maxHealth = maxHealth;
        this.defence = defence;
        this.supply = supply;
        this.gangSize = gangSize;
        this.name = name;
        this.health = maxHealth;
        this.damage = damage;
        this.speed = speed;
        this.position = new Position(x, y);
        this.type = this.getClass().getName().split("\\.")[1];
    }

    public String getName(){
        return this.getClass().getName().split("\\.")[1];
    }

    public float getHealth(){
        return health;
    }

    public int getSpeed(){
        return speed;
    }

    public Position getPosition() {
        return position;
    }

    @Override
    public String getInfo() {
        String outStr = String.format("\t%-3s\t %-3d\t\uD83D\uDEE1 %-3d\t%-3d%%\t%-3d\t ", type, attack,defence,(int) health * 100/maxHealth,(damage[0] + damage[1])/2);
        return outStr;
    }

    @Override
    public String toString() {
        return String.format("%s",this.name);
    }

    @Override
    public void step(ArrayList<BaseHero> team,ArrayList<BaseHero> ourTeam) {
        //System.out.println("Шаг");
    }

    public void attack(BaseHero target, int[] damage){
        int causeDamage = (damage[0] + damage[1])/2;
        //System.out.printf("%s атакует %s\t\n", this.getName(), target.getName());
        //System.out.printf("Сила атаки равна %d\t\n", causeDamage);
        target.getDamage(causeDamage);
    }

    public void getDamage(int damage){
        if(this.health - damage > 0){
            this.health -= damage;
           //System.out.printf("Оставшиеся жизни %f\n", this.health);
        }
        else{
            this.health = 0;
            //System.out.printf("%s убит\n", this.name); 
        }
    }
}