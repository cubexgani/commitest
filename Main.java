public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int n = 67;
        System.out.println("The value of n is " + n);
        System.out.println(palindrome(n));
        n = 1331;
        System.out.println(palindrome(n));
        System.out.println(evenOdd(n));
    }
    static boolean palindrome(int s) {
        int cp = s, rev = 0;
        while (s > 0) {
            int d = s % 10;
            rev = rev * 10 + d;
            s /= 10;
        }
        if (rev == cp) return true;
        return false;
    }
    static boolean evenOdd(int n) {
        return n % 2 == 0 ? true : false;
    }
}
