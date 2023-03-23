package Units;

import java.util.ArrayList;

public class Peasant extends BaseHero{
    protected int food;
    protected int money;
    protected int maxFood;
    protected int maxMoney;
    
    private int X;
    private int Y;

    public Peasant(int x, int y) {
        super(String.format("Peasant #%d", ++Peasant.number),
                1, 1, 3, x, y);
        this.maxFood = Peasant.r.nextInt(100, 110);
        this.maxMoney = Peasant.r.nextInt(80, 140);
        this.food = maxFood;
        this.money = maxMoney;
        this.X = x;
        this.Y = y;
    }

    @Override
    public String getInfo() {
        return String.format("Name: %s  Hp: %d  Damage: %d  Type: %s  Speed: %d  Money: %d  Coordinates(x,y): %d, %d",
        this.name, this.hp, this.damage, this.getClass().getSimpleName(), this.speed, this.money, this.X, this.Y);
    }

    @Override
    public void step(ArrayList<BaseHero> team,ArrayList<BaseHero> ourTeam) {
        System.out.println("Peasants step");
    }

    @Override
    public String toString() {
        return "Peasant";
    }
}
