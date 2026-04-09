public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int n = 67;
        System.out.println("The value of n is " + n);
        System.out.println(palindrome(n));
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
}
