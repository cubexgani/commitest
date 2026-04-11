public class Sphere {
    int radius;
    Sphere(int r) {
        radius = r;
    }
    double volume() {
        return 4 / 3 * Math.PI * radius * radius * radius;
    }
    double surfaceArea() {
        return 4 * Math.PI * radius * radius;
    }
    public String toString() {
        return String.format("Sphere [ radius = %.2f ]", radius);
    }
    public static void main(String[] args) {
        Sphere sp = new Sphere(4);
        System.out.println(sp);
        System.out.println("Sphere volume = " + sp.volume());
        System.out.println("Sphere surface area = " + sp.surfaceArea());
    }
}