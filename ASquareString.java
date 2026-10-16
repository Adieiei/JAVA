import java.util.Scanner;
public class ASquareString{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String str = sc.next();
            int n = str.length();

            if (n % 2 == 0) {
                String first = str.substring(0, n / 2);
                String second = str.substring(n / 2);

                if (first.equals(second)) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}