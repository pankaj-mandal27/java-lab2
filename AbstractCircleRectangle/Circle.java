package AbstractCircleRectangle;

class Circle extends Shape {
    private double radius;
    public Circle(double radius){
        this.radius = radius;
    }
    @Override
    double calculateArea(){
        return Math.PI * radius * radius;
    }
    @Override
    void display(){
        System.out.println("Circle with radius : "+radius);
        System.out.println("Area :"+calculateArea());
    }
}
