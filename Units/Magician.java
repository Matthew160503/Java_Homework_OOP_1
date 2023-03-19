package Units;

import java.util.ArrayList;

public class Magician extends BaseHero {

    private int mana;
    private int maxMana;

    public Magician() {
        super(String.format("Magician #%d", ++Magician.number),
                30, 17, 9);
        this.maxMana = 1;
        this.mana = maxMana;
    }

    @Override
    public String getInfo() {
        return String.format("Name: %s  Hp: %d  Damage: %d  Type: %s  Speed: %d  Mana: %d",
        this.name, this.hp, this.damage, this.getClass().getSimpleName(), this.speed, this.mana);
    }

    @Override
    public void step(ArrayList<BaseHero> team,ArrayList<BaseHero> ourTeam) {
        System.out.println("Magicians step");
    }

    
}
