import java.awt.Color;
import java.awt.Point;

public abstract class Shape {
    protected Color color;
    protected int borderWidth;
    protected Point location;

    public Shape(Color color, int borderWidth, Point location) {
        this.color = color;
        this.borderWidth = borderWidth;
        this.location = location;
    }

    public abstract void paint(Turtle turtle);
}
