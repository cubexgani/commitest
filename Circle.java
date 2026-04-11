public class Circle {
    int radius;
    Circle(int r) {
        radius = r;
    }
    double area() {
        return Math.PI * radius * radius;
    }
    double perimeter() {
        return 2 * Math.PI * radius;
    }
    public static void main(String[] args) {
        Circle c = new Circle(4);
        System.out.println("Perimeter of circle = " + c.perimeter());
        System.out.println("Area of circle = " + c.area());
    }
}
