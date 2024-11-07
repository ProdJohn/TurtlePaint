import java.awt.*;
import java.util.Scanner;

public class MainApp
{
    public static void main(String[] args)
    {
        Scanner Keyboard = new Scanner(System.in);
        System.out.println("Welcome to the Shape Painter Menu \n" +
                "Please type a number from the options below: \n" +
                "1) Add Shape\n" +
                "2) Save Image\n" +
                "3) Exit");
        int choiceSelected = Keyboard.nextInt();
        switch (choiceSelected) {
            case 1: System.out.println("Which shape (1. square, 2. circle, 3. triangle)?");
                int shapeChoice = Keyboard.nextInt();

                System.out.println("What is the border width?");
                int borderWidth = Keyboard.nextInt();

                System.out.println("What is the border color? (Enter a color name like 'RED')");
                Color borderColor;
                try { borderColor = (Color) Color.class.getField(Keyboard.next().toUpperCase()).get(null);
                } catch (Exception e) {
                    System.out.println("Invalid color entered. Defaulting to BLACK.");
                    borderColor = Color.BLACK;
                }

                System.out.println("What is the location of the shape (x,y)?");
                System.out.print("Enter x coordinate: ");
                int x = Keyboard.nextInt();
                System.out.print("Enter y coordinate: ");
                int y = Keyboard.nextInt();
                Point location = new Point(x, y);
                switch (shapeChoice) {
                    case 1: System.out.println("You selected Square. Enter the side length:");
                        int sideLength = Keyboard.nextInt();
                        Square square = new Square(borderColor, borderWidth, location, sideLength);
                        square.paint(new Turtle(new World()));
                        break;
                    case 2: System.out.println("You selected Circle. Enter the radius:");
                        int radius = Keyboard.nextInt();
                        Circle circle = new Circle(borderColor, borderWidth, location, radius);
                        circle.paint(new Turtle(new World()));
                        break;
                    case 3: System.out.println("You selected Triangle. Enter the side length:");
                        int triangleSide = Keyboard.nextInt();
                        Triangle triangle = new Triangle(borderColor, borderWidth, location, triangleSide);
                        triangle.paint(new Turtle(new World()));
                        break;

                    default:
                        System.out.println("Invalid shape selection.");
                        break;
                }
                break;

            case 2:
                System.out.println("Save Image selected.");

                break;

            case 3:
                System.out.println("Exiting the program.");
                break;

            default:
                System.out.println("Invalid choice. Please select a valid option.");
                break;
        }


        // This starter code to get you familiar with how
        // the TurtleLogo application works

        // The world is your canvas
        World world = new World(200, 200);
        Turtle turtle = new Turtle(world,-100, -100);
        
        int width = 200;
        int height = 200;

        // calculate the hypotenuse (diagonal)
        // a2 + b2 = c2
        double widthSquared = Math.pow(width, 2);
        double heightSquared = Math.pow(height, 2);
        double hypotenuse = Math.sqrt(widthSquared + heightSquared);


        turtle.setPenWidth(3);
        turtle.setColor(Color.GREEN);

        turtle.turnRight(45);
        turtle.forward(hypotenuse);

        turtle.penUp();
        turtle.goTo(100, 100);
        turtle.turnRight(90);

        turtle.penDown();
        turtle.forward(hypotenuse);

    }
}
