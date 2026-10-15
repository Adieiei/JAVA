import java.util.Scanner;

public class PalindromeTriangleReverse {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  "); 
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
                if (i > 1) {
                    System.out.print(" ");
                }
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
                if (j < i) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}