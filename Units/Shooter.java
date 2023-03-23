package Units;

import java.util.ArrayList;

public class Shooter extends BaseHero {
    protected int arrows;

    public Shooter(String name, int hp, int damage, int speed, int arrows, int x, int y) {
        super(name, hp, damage, speed, x, y);
        this.arrows = arrows;
    }

    @Override
    public void step(ArrayList<BaseHero> otherTeam, ArrayList<BaseHero> ourTeam) {
        if(this.arrows > 0 && this.hp > 0){
            System.out.println("Стрелок может стрелять");
            for (BaseHero hero : otherTeam){
//Подскажите пожалуста, как использовать метод getDistance из класса Position.Пробовал вызывать так Position.getDistance(hero);
//Но не получается 
                if(hero.hp >  0){
                    attack(hero, this.damage);
                    this.arrows --;
                    break;
                }
            }

            for(BaseHero hero : ourTeam){
                if (hero.toString().equals("Peasant")){
                    this.arrows++;
                    System.out.printf("Стрелку добавлена патрона.Теперь всего патрон: %d\n",this.arrows);
                    break;
                }
            }
        }
        else System.out.println("Стрелок умер или не имеет стрел");
    }
}
