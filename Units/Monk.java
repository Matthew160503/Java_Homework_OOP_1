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
    
    public String getInfo() {
        return String.format("%s  Elixir: %d", super.getInfo(), this.elixir);
    }
}
