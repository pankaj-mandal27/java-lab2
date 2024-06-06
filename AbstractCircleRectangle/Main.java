package AbstractCircleRectangle;
import java.util.Scanner;
public class Main{
    public static void main(String args []){
        Scanner obj = new Scanner(System.in);
        double radius;
        System.out.print("Enter the radius of the circle:");
        Shape circle = new Circle(radius = obj.nextDouble());
        circle.display();
        double len, bre;
        System.out.print("Enter length and breadth of the rectangle: ");
        len = obj.nextDouble();
        bre = obj.nextDouble();
        Shape rectangle = new Rectangle(len,bre);
        rectangle.display();
    }
}