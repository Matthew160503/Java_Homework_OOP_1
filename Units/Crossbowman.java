package Units;

import java.util.ArrayList;

public class Crossbowman extends BaseHero {

    private int arrows;
    private int maxArrows;

    public Crossbowman() {
        super(String.format("Crossbowman #%d", ++Crossbowman.number),
                10, 6, 4);
        this.maxArrows = 16;
        this.arrows = maxArrows;
    }
    
    @Override
    public String getInfo() {
        return String.format("Name: %s  Hp: %d  Damage: %d  Type: %s  Speed: %d  Arrows: %d",
        this.name, this.hp, this.damage, this.getClass().getSimpleName(), this.speed, this.arrows);
    }


    @Override
    public void step(ArrayList<BaseHero> otherTeam, ArrayList<BaseHero> ourTeam) {
        if(this.arrows > 0 && this.hp > 0){
            System.out.println("Арбалтечик может стрелять");
            for (BaseHero hero : otherTeam){
                if(hero.hp >  0){
                    attack(hero, this.damage);
                    this.arrows --;
                    break;
                }
            }

            for(BaseHero hero : ourTeam){
                if (hero.toString().equals("Peasant")){
                    this.arrows++;
                    System.out.printf("Арбалетчику добавлена стрела.Теперь всего стрел: %d\n",this.arrows);
                    break;
                }
            }
        }
        else System.out.println("Арбалетчик умер или не имеет стрел");
    }
}
