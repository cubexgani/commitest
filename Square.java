public class Square {
    int side;
    Square(int a) {
        side = a;
    }
    int area() {
        return side * side;
    }
    public String toString() {
        return "Square [side = " + side + " ]";
    }
    public static void main(String[] args) {
        Square sq = new Square(4);
        System.out.println(sq);
    }
}
