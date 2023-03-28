package Units;

import java.util.ArrayList;

public class Peasant extends BaseHero{

    protected int delivery;

    public Peasant(ArrayList<BaseHero> name,int x, int y, int gangSize) {
        super(name, 1, 1, new int[] {0,1}, 1, 3, x, y, gangSize);
        this.delivery = 1;
    }
}

