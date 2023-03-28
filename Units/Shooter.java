package Units;

import java.util.ArrayList;

public class Shooter extends BaseHero {
    protected int arrows;

    public Shooter(ArrayList<BaseHero> name, int attack, int defence, int[] damage, int maxHealth, int speed, int arrows,int x,
            int y, int gangSize) {
        super(name, attack, defence, damage, maxHealth, speed, x, y, gangSize);
        this.arrows = arrows;
    }

    @Override
    public void step(ArrayList<BaseHero> otherTeam, ArrayList<BaseHero> ourTeam) {
        if(this.arrows > 0 && this.health > 0){
            //System.out.println("Стрелок может стрелять");

            BaseHero target = otherTeam.get(0);
            double minDistance = this.position.getDistance(otherTeam.get(0));

            for (BaseHero hero : otherTeam){
                if(minDistance > position.getDistance(hero) && hero.getHealth() > 0){
                    minDistance = position.getDistance(hero);
                    target = hero;
                }
            }

            attack(target, this.damage);
            this.arrows --;

            for(BaseHero hero : ourTeam){
                if (hero.toString().equals("Peasant")){
                    this.arrows++;
                    //System.out.printf("Стрелку добавлена патрона.Теперь всего патрон: %d\n",this.arrows);
                    break;
                }
            }
        }
       // else System.out.println("Стрелок умер или не умеет стрел");
    }
}