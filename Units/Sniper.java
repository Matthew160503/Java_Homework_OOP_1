package Units;

public class Sniper extends Shooter{

    private int X;
    private int Y;

    public Sniper(int x, int y) {
        super(String.format("Sniper #%d", ++Sniper.number),
                15, 12, 9, 32, x, y);
        this.X = x;
        this.Y = y;
    }
    
    @Override
    public String getInfo() {
        return String.format("Name: %s  Hp: %d  Damage: %d  Type: %s  Speed: %d  Arrows: %d  Coordinates(x,y): %d, %d",
        this.name, this.hp, this.damage, this.getClass().getSimpleName(), this.speed, arrows, this.X, this.Y);
    }

    @Override
    public String toString() {
        return "Sniper";
    }
}
