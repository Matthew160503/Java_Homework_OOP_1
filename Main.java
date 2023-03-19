import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

import Units.*;

public class Main{
    public static void main(String[] args) {
        ArrayList<BaseHero> team1 = new ArrayList<>();
        ArrayList<BaseHero> team2 = new ArrayList<>();
        ArrayList<BaseHero> fullStack = new ArrayList<>();

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

        fullStack.addAll(team1);
        fullStack.addAll(team2);

        fullStack.sort(new Comparator<BaseHero>(){
            @Override
            public int compare(BaseHero h1, BaseHero h2){
                if (h1.getSpeed() == h2.getSpeed()) return 0;
                else if (h1.getSpeed() > h2.getSpeed()) return 1;
                else return -1;
            }
        });

        System.out.println("\nTeam1:");
        for(BaseHero hero1: team1) System.out.println(hero1.getName());
        System.out.println("\nTeam2:");
        for(BaseHero hero2: team2) System.out.println(hero2.getName());

        System.out.println("\nвся информация про героев:");
        for(BaseHero hero : fullStack) System.out.println(hero.getInfo());
        System.out.println("\n");
        
        team1.forEach(u -> u.step(team2, team1));
        
    }
}