package Units;

import java.util.ArrayList;

public class Spearman extends BaseHero{
    protected int armor;
    protected int maxArmor;

    private int X;
    private int Y;

    public Spearman(int x, int y) {
        super(String.format("Spearman #%d", ++Spearman.number),
                10, 4,4, x, y);
        this.maxArmor = Spearman.r.nextInt(130, 140);
        this.armor = maxArmor;
        this.X = x;
        this.Y = y;
    }

    @Override
    public String getInfo() {
        return String.format("Name: %s  Hp: %d  Damage: %d  Type: %s  Speed: %d  Armor: %d  Coordinates(x,y): %d, %d",
        this.name, this.hp, this.damage, this.getClass().getSimpleName(), this.speed, this.armor, this.X, this.Y);
    }

    @Override
    public void step(ArrayList<BaseHero> team,ArrayList<BaseHero> ourTeam) {
        System.out.println("Spearmans step");
    }
    
    @Override
    public String toString() {
        return "Spearman";
    }
}
