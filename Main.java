import java.util.ArrayList;
import java.util.Random;

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
        ArrayList<BaseHero> team1 = new ArrayList<>();
        ArrayList<BaseHero> team2 = new ArrayList<>();

        for(int i = 0; i < 10; i++){
            switch(new Random().nextInt(4)){
                case 0:
                    team1.add(new Crossbowman());
                    break;
                case 1:
                    team1.add(new Magician());
                    break;
                case 2:
                    team1.add(new Robber());
                    break;
                default:
                    team1.add(new Peasant());
                    break;

            }

            switch(new Random().nextInt(4)){
                case 0:
                    team2.add(new Sniper());
                    break;
                case 1:
                    team2.add(new Monk());
                    break;
                case 2:
                    team2.add(new Spearman());
                    break;
                default:
                    team2.add(new Peasant());
                    break;

            }
        }

        System.out.println("\nTeam1:");
        for(BaseHero hero1: team1) System.out.println(hero1.getInfo());
        System.out.println("\nTeam2:");
        for(BaseHero hero2: team2) System.out.println(hero2.getInfo());
    }
}