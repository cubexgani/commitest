public class Circle {
    int radius, cx, cy;
    Circle(int r, int x, int y) {
        radius = r;
        cx = x;
        cy = y;
    }
    double area() {

        return Math.PI * radius * radius;
    }
    double perimeter() {
        return 2 * Math.PI * radius;
    }
    int regionWrtCircle(int x, int y) {
        int xsq = (x - cx) * (x - cx);
        int ysq = (y - cy) * (y - cy);
        int xysqs = xsq + ysq;
        int rsq = radius * radius;
        if (xysqs > rsq) return 1;
        else if (xysqs == rsq) return 0;
        else return -1;
    }
    public static void main(String[] args) {
        Circle c = new Circle(5, 0, 0);
        System.out.println("Perimeter of circle = " + c.perimeter());
        System.out.println("Area of circle = " + c.area());
        int loc = c.regionWrtCircle(3, 4);
        if (loc < 0) System.out.println("Inside");
        else if (loc == 0) System.out.println("On");
        else System.out.println("Outside");
    }
}
