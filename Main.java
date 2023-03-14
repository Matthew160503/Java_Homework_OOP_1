import java.util.ArrayList;

import Units.BaseHero;
import Units.Crossbowman;
import Units.Magician;
import Units.Monk;
import Units.Peasant;
import Units.Robber;
import Units.Sniper;
import Units.Spearman;

public class Main{
    public static void main(String[] args) {
        Crossbowman crossbowman1 = new Crossbowman();
        Magician magician1 = new Magician();
        Monk monk1 = new Monk();
        Peasant peasant1 = new Peasant();
        Robber robber1 = new Robber();
        Sniper sniper1 = new Sniper();
        Spearman spearman1 = new Spearman();
        
        // System.out.println(crossbowman1.getInfo());
        // System.out.println(magician1.getInfo());
        // System.out.println(monk1.getInfo());
        // System.out.println(peasant1.getInfo());
        // System.out.println(robber1.getInfo());
        // System.out.println(sniper1.getInfo());
        // System.out.println(spearman1.getInfo());

        ArrayList<BaseHero> library = new ArrayList<>();
        library.add(crossbowman1);
        library.add(magician1);
        library.add(monk1);
        library.add(peasant1);
        library.add(robber1);
        library.add(sniper1);
        library.add(spearman1);

        for(BaseHero person : library){
            System.out.println(person.getInfo());
        }
    }
}