import java.util.Scanner;

public class WeigthedDigitRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong(); // Used nextLong() to match long variable type

        while (n >= 10) {
            long temp = n;
            int c = 0;
            
            // Count total digits
            while (temp > 0) {
                c++;
                temp = temp / 10;
            }

            temp = n;
            long sum = 0;
            int weight = c;

            // Compute weighted digit sum
            while (temp > 0) {
                long digit = temp % 10;
                sum = sum + digit * weight;
                weight--;
                temp = temp / 10;
            }

            n = sum;
        }

        // Single print statement at the end for all cases
        System.out.println(n);
    }
}