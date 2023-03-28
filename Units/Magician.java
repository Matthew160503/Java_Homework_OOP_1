package Units;

import java.util.ArrayList;

public class Magician extends BaseHero {

    private int mana;
    private int maxMana;

    public Magician(ArrayList<BaseHero> name,int x, int y, int gangSize) {
        super(name, 17, 12, new int[] {2, 5}, 30, 9, x, y, gangSize);
        this.maxMana = 1;
        this.mana = maxMana;
    }
    
}
