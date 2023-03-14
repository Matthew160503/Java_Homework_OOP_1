package Units;


public class Spearman extends BaseHero{
    protected int armor;
    protected int maxArmor;

    public Spearman() {
        super(String.format("Hero_Spearman #%d", ++Spearman.number),
                Spearman.r.nextInt(150, 155), 120);
        this.maxArmor = Spearman.r.nextInt(130, 140);
        this.armor = maxArmor;
    }

    public String getInfo() {
        return String.format("%s  Armor: %d", super.getInfo(), this.armor);
    }
    
}
