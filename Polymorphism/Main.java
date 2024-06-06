package Polymorphism;

public class Main {
    public static void main(String args[])
    {
        Shape[] shapes= new Shape[2];
        shapes[0] = new Circle(12.43f);
        shapes[1] = new Rectangle(5.42f,4.32f);


        for (Shape shape : shapes){
            shape.display();
            System.out.println();
        }
    }

}
