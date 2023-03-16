package Units;

public class Monk extends BaseHero {

    private int elixir;
    private int maxElixir;

    public Monk() {
        super(String.format("Hero_Monk #%d", ++Monk.number),
                Monk.r.nextInt(80, 100), 130);
        this.maxElixir = Monk.r.nextInt(50, 120);
        this.elixir = maxElixir;
    }
    
    @Override
    public String getInfo() {
        return "Monk";
    }

    @Override
    public void step() {
        System.out.println("Monks step");
    }

    
}
