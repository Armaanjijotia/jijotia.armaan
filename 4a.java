import java.util.Scanner;
interface Shape {
double calculateArea(); 
}

class Rectangle implements Shape {
private double length, width;

 public Rectangle(double length, double width) {
 this.length = length;
 this.width = width;
}

 @Override
public double calculateArea() {
return length * width;
}
}

class Circle implements Shape {
 private double radius;
 private static final double PI = 3.14159;

public Circle(double radius) {
this.radius = radius;
}

 @Override
 public double calculateArea() {
 return PI * radius * radius;
 }
}

class AreaCalculator {
public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);

 System.out.print("Enter length of rectangle: ");
  double length = scanner.nextDouble();
 System.out.print("Enter width of rectangle: ");
 double width = scanner.nextDouble();
 Shape rectangle = new Rectangle(length, width);

 System.out.print("Enter radius of circle: ");
 double radius = scanner.nextDouble();
Shape circle = new Circle(radius);

 System.out.println("Area of Rectangle: " + rectangle.calculateArea());
 System.out.println("Area of Circle: " + circle.calculateArea());

 scanner.close();
}
}
