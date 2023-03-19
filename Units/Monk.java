package Units;

import java.util.ArrayList;

public class Monk extends BaseHero {

    private int elixir;
    private int maxElixir;

    public Monk() {
        super(String.format("Monk #%d", ++Monk.number),
                30, 12, 5);
        this.maxElixir = 1;
        this.elixir = maxElixir;
    }
    
    @Override
    public String getInfo() {
        return String.format("Name: %s  Hp: %d  Damage: %d  Type: %s  Speed: %d Elixir: %d",
        this.name, this.hp, this.damage, this.getClass().getSimpleName(), this.speed, this.elixir);
    }

    @Override
    public void step(ArrayList<BaseHero> team,ArrayList<BaseHero> ourTeam) {
        System.out.println("Monks step");
    }

    
}
