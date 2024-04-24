class Shape {
    public void area() {
    }
}

class Rectangle extends Shape {
    int length;
    int breadth;

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void area() {
        System.out.println("Area of Rectangle is:" + length * breadth);
    }
}

class Triangle extends Shape {
    int breadth;
    int height;

    Triangle(int breadth, int height) {
        this.breadth = breadth;
        this.height = height;
    }

    public void area() {
        System.out.println("Area of Triangle is:" + (breadth * height) / 2);
    }
}

public class AreaShape {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(30, 40);
        rectangle.area();
        Shape triangle = new Triangle(30, 40);
        triangle.area();
    }
}
