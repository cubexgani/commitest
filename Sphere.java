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
    public static void main(String[] args) {
        Sphere sp = new Sphere(4);
        System.out.println("Sphere volume = " + sp.volume());
        System.out.println("Sphere surface area = " + sp.surfaceArea());
    }
}