import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int n = sc.nextInt();
        System.out.println(isPrime(n) ? "Prime" : "Composite");
    }
    static boolean isPrime(int n) {
        int c = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) c++;
        }
        if (c > 1) return false;
        return true;
    }
}
