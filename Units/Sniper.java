package Units;

import java.util.ArrayList;

public class Sniper extends BaseHero{

    private int bullets;
    private int maxBullets;

    public Sniper() {
        super(String.format("Sniper #%d", ++Sniper.number),
                15, 12, 9);
        this.maxBullets = 32;
        this.bullets = maxBullets;
    }
    
    @Override
    public String getInfo() {
        return String.format("Name: %s  Hp: %d  Damage: %d  Type: %s  Speed: %d  Bullets: %d",
        this.name, this.hp, this.damage, this.getClass().getSimpleName(), this.speed, bullets);
    }

    @Override
    public void step(ArrayList<BaseHero> otherTeam, ArrayList<BaseHero> ourTeam) {
        if(this.bullets > 0 && this.hp > 0){
            System.out.println("Снайпер может стрелять");
            for (BaseHero hero : otherTeam){
                if(hero.hp >  0){
                    attack(hero, this.damage);
                    this.bullets --;
                    break;
                }
            }

            for(BaseHero hero : ourTeam){
                if (hero.getInfo().equals("Peasant")){
                    this.bullets++;
                    System.out.printf("Снайперу добавлена патрона.Теперь всего патрон: %d\n",this.bullets);
                    break;
                }
            }
        }
        else System.out.println("Снайпер умер или не имеет стрел");
    }

    

}
