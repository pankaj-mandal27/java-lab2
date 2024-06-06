package Polymorphism;

 class Rectangle extends Shape {
  public float len,bre;
  public Rectangle(float len, float bre)
  {
   this.len=len;
   this.bre= bre;
  }

  @Override
  public double calculateArea() {
   return len*bre;
  }

  @Override
  public void display() {
   System.out.println("The area of Rectangle with length "+len+" and bredth "+bre+" is "+calculateArea());
  }
 }
