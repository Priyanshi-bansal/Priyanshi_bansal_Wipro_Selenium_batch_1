package abstract_ex;

import java.util.Scanner;

abstract class Shape {

 abstract double area();
}

class Circle extends Shape {
 double radius;

 Circle(double radius) {
     this.radius = radius;
 }


 double area() {
     return Math.PI * radius * radius;
 }
}

class Rectangle extends Shape {
 double length, width;

 Rectangle(double length, double width) {
     this.length = length;
     this.width = width;
 }


 double area() {
     return length * width;
 }
}

class Triangle extends Shape {
 double base, height;

 Triangle(double base, double height) {
     this.base = base;
     this.height = height;
 }

 double area() {
     return 0.5 * base * height;
 }
}

public class ShapeDemo {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

   
     System.out.print("Enter radius of circle: ");
     double r = sc.nextDouble();
     Shape circle = new Circle(r);
     System.out.println("Area of Circle: " + circle.area());

    
     System.out.print("Enter length and width of rectangle: ");
     double l = sc.nextDouble();
     double w = sc.nextDouble();
     Shape rectangle = new Rectangle(l, w);
     System.out.println("Area of Rectangle: " + rectangle.area());

  
     System.out.print("Enter base and height of triangle: ");
     double b = sc.nextDouble();
     double h = sc.nextDouble();
     Shape triangle = new Triangle(b, h);
     System.out.println("Area of Triangle: " + triangle.area());

     sc.close();
 }
}
