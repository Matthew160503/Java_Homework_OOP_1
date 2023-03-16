package Units;

public class Crossbowman extends BaseHero {

    private int arrows;
    private int maxArrows;

    public Crossbowman() {
        super(String.format("Hero_Crossbowman #%d", ++Crossbowman.number),
                Crossbowman.r.nextInt(70, 90), 110);
        this.maxArrows = Sniper.r.nextInt(20, 30);
        this.arrows = maxArrows;
    }
    
    @Override
    public String getInfo() {
        return "Crossbowman";
    }

    @Override
    public void step() {
        System.out.println("Hero step");
    }
    

}
