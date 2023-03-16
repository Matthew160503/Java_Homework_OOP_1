package Units;

public class Magician extends BaseHero {

    private int mana;
    private int maxMana;

    public Magician() {
        super(String.format("Hero_Magician #%d", ++Magician.number),
                Magician.r.nextInt(100, 120), 100);
        this.maxMana = Magician.r.nextInt(50, 150);
        this.mana = maxMana;
    }

    @Override
    public String getInfo() {
        return "Magician";
    }

    @Override
    public void step() {
        System.out.println("Magicians step");
    }

    
}
