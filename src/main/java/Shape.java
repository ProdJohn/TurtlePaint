import java.awt.*;

public abstract class Shape {
    //turtle: the turtle that is used to paint the shape
    //location: Point -- the x,y coordinate where the shape
    //should be drawn
    //color: the color used for the border
    //border: the width of the shape border
    //paint() - the method that paints the shape on the
    protected String Turtle, color;
    protected float border;
    protected Point location;

    public Shape(String turtle, String color, float border, Point location) {
        this.Turtle = turtle;
        this.color = color;
        this.border = border;
        this.location = location;
    }

    public String getTurtle() {
        return Turtle;
    }

    public String getColor() {
        return color;
    }

    public float getBorder() {
        return border;
    }

    public Point getLocation() {
        return location;
    }
}
