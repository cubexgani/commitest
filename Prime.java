import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.print("I won't leave you until you enter a prime number = ");
            int n = sc.nextInt();
            boolean p = isPrime(n);
            if (p) {
                System.out.println("Prime");
                flag = false;
            }
            else System.out.println("Composite");
        }
        System.out.println("Goodbye");
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
