package Units;

import java.util.ArrayList;

public class Robber extends BaseHero {

    private int destruction;
    private int maxDestruction;

    public Robber() {
        super(String.format("Robber #%d", ++Robber.number),
                10, 8, 6);
        this.maxDestruction = Robber.r.nextInt(40, 80);
        this.destruction = maxDestruction;
    }
    
    @Override
    public String getInfo() {
        return String.format("Name: %s  Hp: %d  Damage: %d  Type: %s  Speed: %d  Destruction: &d",
        this.name, this.hp, this.damage, this.getClass().getSimpleName(), this.speed, this.destruction);
    }

    @Override
    public void step(ArrayList<BaseHero> team,ArrayList<BaseHero> ourTeam) {
        System.out.println("Robbers step");
    }
    
}
