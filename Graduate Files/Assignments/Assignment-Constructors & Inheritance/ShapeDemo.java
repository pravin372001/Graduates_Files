abstract class Shape {
    public abstract double area();

    public abstract double perimeter();
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public double perimeter() {
        return 2 * (width + height);
    }
}

public class ShapeDemo {

    public static void main(String[] args) {
        Shape s = new Circle(5);
        System.out.printf("Area of circle is: %.2f\n", s.area());
        System.out.printf("Perimeter of circle is :%.2f\n", s.perimeter());
        Shape s2 = new Rectangle(10, 5);
        System.out.println("Area of rectangle is:" + s2.area());
        System.out.println("Perimeter of rectangle is:" + s2.perimeter());
    }
}
