public class Cube {
    int side;
    Cube(int a) {
        side = a;
    }
    int volume() {
        return side * side * side;
    }
    int lateralArea() {
        return 4 * side * side;
    }
    int totalArea() {
        return 6 * side * side;
    }
    public static void main(String[] args) {
        Cube cb = new Cube(5);
        System.out.println("Volume = " + cb.volume());
        System.out.println("Lateral area = " + cb.lateralArea());
        System.out.println("Total area = " + cb.totalArea());
    }
}
