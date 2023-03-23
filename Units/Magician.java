package Units;

import java.util.ArrayList;

public class Magician extends BaseHero {

    private int X;
    private int Y;

    private int mana;
    private int maxMana;

    public Magician(int x, int y) {
        super(String.format("Magician #%d", ++Magician.number),
                30, 17, 9, x, y);
        this.maxMana = 1;
        this.mana = maxMana;
        this.X = x;
        this.Y = y;
    }

    @Override
    public String getInfo() {
        return String.format("Name: %s  Hp: %d  Damage: %d  Type: %s  Speed: %d  Mana: %d  Coordinates(x,y): %d, %d",
        this.name, this.hp, this.damage, this.getClass().getSimpleName(), this.speed, this.mana, this.X, this.Y);
    }

    @Override
    public void step(ArrayList<BaseHero> team,ArrayList<BaseHero> ourTeam) {
        System.out.println("Magicians step");
    }

    @Override
    public String toString() {
        return "Magician";
    }    
}
