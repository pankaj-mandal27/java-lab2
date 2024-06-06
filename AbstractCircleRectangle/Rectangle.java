package AbstractCircleRectangle;

class Rectangle extends Shape {
        private double len;
        private double bre;

   public Rectangle(double len, double bre){
       this.len = len;
       this.bre = bre;

}
@Override
    double calculateArea(){
       return len * bre;
}
@Override
    void display(){
    System.out.println("Rectangle with len: "+len+" and bre: "+bre);
    System.out.println("Area : "+calculateArea());
}
}
