import java.awt.*;

public class Circle extends Shape {
    private int radius;

    public Circle(Color color, int borderWidth, Point location, int radius) {
        super(color, borderWidth, location);
        this.radius = radius;
    }

    @Override
    public void paint(Turtle turtle) {
        turtle.penUp();
        turtle.goTo(location.x + radius, location.y);
        turtle.penDown();
        turtle.setPenWidth(borderWidth);
        turtle.setColor(color);

        for (int i = 0; i < 360; i++) {
            turtle.forward(2 * Math.PI * radius / 360);
            turtle.turnRight(1);
        }
    }
}
