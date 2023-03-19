package Units;

import java.util.ArrayList;

public class Spearman extends BaseHero{
    protected int armor;
    protected int maxArmor;

    public Spearman() {
        super(String.format("Spearman #%d", ++Spearman.number),
                10, 4,4);
        this.maxArmor = Spearman.r.nextInt(130, 140);
        this.armor = maxArmor;
    }

    @Override
    public String getInfo() {
        return String.format("Name: %s  Hp: %d  Damage: %d  Type: %s  Speed: %d  Armor: %d",
        this.name, this.hp, this.damage, this.getClass().getSimpleName(), this.speed, this.armor);
    }

    @Override
    public void step(ArrayList<BaseHero> team,ArrayList<BaseHero> ourTeam) {
        System.out.println("Spearmans step");
    }
    
    
}
