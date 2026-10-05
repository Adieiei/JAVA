import java.util.Scanner;

public class ASausageBank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            long maxAmount = (1L << (n - k + 1)) + 2L * (k - 1);
            System.out.println(maxAmount);
        }
    }
}