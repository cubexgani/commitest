public class Sphere {
    int radius, cx, cy, cz;
    Sphere(int r, int x, int y, int z) {
        radius = r;
        cx = x; cy = y; cz = z;
    }
    double volume() {
        return 4 / 3 * Math.PI * radius * radius * radius;
    }
    double surfaceArea() {
        return 4 * Math.PI * radius * radius;
    }
    int region(int x, int y, int z) {
        int xsq = (x - cx) * (x - cx);
        int ysq = (y - cy) * (y - cy);
        int zsq = (z - cz) * (z - cz);
        int s = xsq + ysq + zsq - radius * radius;
	if (s == 0) return 0;
        return s / Math.abs(s);
    }
    public String toString() {
        return String.format("Sphere [ radius = %d ]", radius);
    }
    public static void main(String[] args) {
        Sphere sp = new Sphere(5, 0, 0, 0);
        System.out.println(sp);
        System.out.println("Sphere volume = " + sp.volume());
        System.out.println("Sphere surface area = " + sp.surfaceArea());
        int f = sp.region(3, 4, 0);
        if (f < 0) System.out.println("Inside sphere");
        else if (f == 0) System.out.println("On sphere");
        else System.out.println("Outside sphere");
    }
}
