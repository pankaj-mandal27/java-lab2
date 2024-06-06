package Polymorphism;

class Circle extends Shape
 {
     public float radius;

     public Circle(float radius)
     {
         this.radius=radius;

     }
     public double calculateArea()
     {
         return Math.PI*radius*radius;

     }

     @Override
     public void display() {
         System.out.println("The area of Circle with radius "+radius+" is "+calculateArea());
     }
 }
