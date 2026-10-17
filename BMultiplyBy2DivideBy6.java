import java.util.Scanner;
public class BMultiplyBy2DivideBy6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int twos = 0;
            int threes = 0;

            while (n % 2 == 0) {
                n /= 2;
                twos++;
            }

            while (n % 3 == 0) {
                n /= 3;
                threes++;
            }

            if (n != 1 || twos > threes) {
                System.out.println(-1);
            } else {
                System.out.println(2 * threes - twos);
            }
        }
    }
}
