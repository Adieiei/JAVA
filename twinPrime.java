import java.util.*;

public class twinPrime{
    // Helper method to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int e = sc.nextInt();
        
        int count = 0;
        
        // Loop through all candidate p1 values up to (e - 2)
        for (int i = s; i <= e - 2; i++) {
            // Check if both i and i + 2 are prime
            if (isPrime(i) && isPrime(i + 2)) {
                count++;
            }
        }
        
        System.out.println(count);
    }
}