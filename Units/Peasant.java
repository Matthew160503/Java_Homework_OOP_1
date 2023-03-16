package Units;

public class Peasant extends BaseHero{
    protected int food;
    protected int money;
    protected int maxFood;
    protected int maxMoney;

    public Peasant() {
        super(String.format("Hero_Peasant #%d", ++Peasant.number),
                Peasant.r.nextInt(40, 60), 40);
        this.maxFood = Peasant.r.nextInt(100, 110);
        this.maxMoney = Peasant.r.nextInt(80, 140);
        this.food = maxFood;
        this.money = maxMoney;
    }

    @Override
    public String getInfo() {
        return "Peasant";
    }

    @Override
    public void step() {
        System.out.println("Peasants step");
    }

    
    
}
