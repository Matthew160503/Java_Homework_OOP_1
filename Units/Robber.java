package Units;

import java.util.ArrayList;

public class Robber extends BaseHero {

    private int X;
    private int Y;

    private int destruction;
    private int maxDestruction;

    public Robber(int x, int y) {
        super(String.format("Robber #%d", ++Robber.number),
                10, 8, 6, x, y);
        this.maxDestruction = Robber.r.nextInt(40, 80);
        this.destruction = maxDestruction;
        this.X = x;
        this.Y = y;
    }
    
    @Override
    public String getInfo() {
        return String.format("Name: %s  Hp: %d  Damage: %d  Type: %s  Speed: %d  Destruction: %d  Coordinates(x,y): %d, %d",
        this.name, this.hp, this.damage, this.getClass().getSimpleName(), this.speed, this.destruction, this.X, this.Y);
    }

    @Override
    public void step(ArrayList<BaseHero> team,ArrayList<BaseHero> ourTeam) {
        System.out.println("Robbers step");
    }
    
    @Override
    public String toString() {
        return "Robber";
    }
}
