import java.awt.*;

public class Triangle extends Shape {
    private int sideLength;

    public Triangle(Color color, int borderWidth, Point location, int sideLength) {
        super(color, borderWidth, location);
        this.sideLength = sideLength;
    }

    @Override
    public void paint(Turtle turtle) {
        turtle.penUp();
        turtle.goTo(location.x, location.y);
        turtle.penDown();
        turtle.setPenWidth(borderWidth);
        turtle.setColor(color);

        for (int i = 0; i < 3; i++) {
            turtle.forward(sideLength);
            turtle.turnRight(120);
        }
    }
}