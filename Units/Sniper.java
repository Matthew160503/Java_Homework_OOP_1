package Units;

public class Sniper extends BaseHero {

    private int bullets;
    private int maxBullets;

    public Sniper() {
        super(String.format("Hero_Sniper #%d", ++Sniper.number),
                Sniper.r.nextInt(80, 90), 120);
        this.maxBullets = Sniper.r.nextInt(30, 40);
        this.bullets = maxBullets;
    }
    
    public String getInfo() {
        return String.format("%s  Bullets: %d", super.getInfo(), this.bullets);
    }
}
