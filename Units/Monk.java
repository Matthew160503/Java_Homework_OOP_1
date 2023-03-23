package Units;

import java.util.ArrayList;

public class Monk extends BaseHero {

    private int X;
    private int Y;

    private int elixir;
    private int maxElixir;

    public Monk(int x, int y) {
        super(String.format("Monk #%d", ++Monk.number),
                30, 12, 5, x, y);
        this.maxElixir = 1;
        this.elixir = maxElixir;
        this.X = x;
        this.Y = y;
    }
    
    @Override
    public String getInfo() {
        return String.format("Name: %s  Hp: %d  Damage: %d  Type: %s  Speed: %d Elixir: %d  Coordinates(x,y): %d, %d",
        this.name, this.hp, this.damage, this.getClass().getSimpleName(), this.speed, this.elixir, this.X, this.Y);
    }

    @Override
    public void step(ArrayList<BaseHero> team,ArrayList<BaseHero> ourTeam) {
        System.out.println("Monks step");
    }

    @Override
    public String toString() {
        return "Monk";
    }
}
