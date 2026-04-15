public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int n = 67;
        System.out.println("The value of n is " + n);
        System.out.println(evenOdd(n));
    }
    static bool evenOdd(int n) {
        return n % 2 ? true : false;
    }
}
