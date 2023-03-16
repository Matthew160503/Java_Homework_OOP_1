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

    @Override
    public String getInfo() {
        return "Spearman";
    }

    @Override
    public void step() {
        System.out.println("Spearmans step");
    }
    
    
}
