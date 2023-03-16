package Units;

public class Robber extends BaseHero {

    private int destruction;
    private int maxDestruction;

    public Robber() {
        super(String.format("Hero_Robber #%d", ++Robber.number),
                Robber.r.nextInt(120, 140), 150);
        this.maxDestruction = Robber.r.nextInt(40, 80);
        this.destruction = maxDestruction;
    }
    
    @Override
    public String getInfo() {
        return "Robber";
    }

    @Override
    public void step() {
        System.out.println("Robbers step");
    }
    
}
