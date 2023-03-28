import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

import Units.*;

public class Main{

    public static final int GANG_SIZE = 10;

    public static ArrayList<BaseHero> whiteSide;

    public static ArrayList<BaseHero> darkSide;

    public static ArrayList<BaseHero> fullStack;
    public static void main(String[] args) {
        init();


        Scanner sc = new Scanner(System.in);
        while (true) {
            ConsoleView.view();
            makeStep();
            sc.nextLine();
        }
    }

    private static void init(){
        whiteSide = new ArrayList<>();
        darkSide = new ArrayList<>();
        fullStack = new ArrayList<>();

        int x = 1;
        int y = 1;
        for (int i = 0; i < GANG_SIZE; i++) {
            switch(new Random().nextInt(4)){
                case 0: whiteSide.add(new Peasant(whiteSide, x, y++, GANG_SIZE)); break;
                case 1: whiteSide.add(new Crossbowman(whiteSide, x, y++, GANG_SIZE)); break;
                case 2: whiteSide.add(new Monk(whiteSide, x, y++, GANG_SIZE)); break;
                default: whiteSide.add(new Spearman(whiteSide, x, y++, GANG_SIZE)); break;
            }
        }

        x = GANG_SIZE;
        y = 1;

        for (int i = 0; i < GANG_SIZE; i++) {
            switch(new Random().nextInt(4)){
                case 0: darkSide.add(new Peasant(darkSide, x, y++, GANG_SIZE)); break;
                case 1: darkSide.add(new Sniper(darkSide, x, y++, GANG_SIZE)); break;
                case 2: darkSide.add(new Magician(darkSide, x, y++, GANG_SIZE)); break;
                default: darkSide.add(new Robber(darkSide, x, y++, GANG_SIZE)); break;
            }
        }

        fullStack.addAll(whiteSide);
        fullStack.addAll(darkSide);
    }
    
    private static void makeStep(){
        HashSet<Integer> speedRates = new HashSet<>();
        for (BaseHero hero : fullStack){
            speedRates.add(hero.getSpeed());
        }

        ArrayList<Integer> speeds = new ArrayList<>(speedRates);
        Collections.sort(speeds, Collections.reverseOrder());

        for (int speed : speeds){
            ArrayList<BaseHero> speedArray = new ArrayList<>();
            for(BaseHero unit : fullStack){
                if(unit.getSpeed() == speed){
                    speedArray.add(unit);
                }
            }
            Collections.shuffle(speedArray);
            for (BaseHero hero : speedArray){
                if (hero.name.equals(darkSide)){
                    hero.step(whiteSide, darkSide);
                } else{
                    hero.step(darkSide, whiteSide);
                }
            }
        }
    }
}
