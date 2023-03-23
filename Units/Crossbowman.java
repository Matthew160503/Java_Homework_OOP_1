package Units;

public class Crossbowman extends Shooter {

    private int X;
    private int Y;

    public Crossbowman(int x, int y) {
        super(String.format("Crossbowman #%d", ++Crossbowman.number),
                10, 6, 4, 16, x, y);
        this.X = x;
        this.Y = y;
    }
    
    @Override
    public String getInfo() {
        return String.format("Name: %s  Hp: %d  Damage: %d  Type: %s  Speed: %d  Arrows: %d  Coordinates(x,y): %d, %d",
        this.name, this.hp, this.damage, this.getClass().getSimpleName(), this.speed, this.arrows, this.X, this.Y);
    }

    @Override
    public String toString() {
        return "Crossbowman";
    }
}
