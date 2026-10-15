
import java.util.Scanner;

public class LongestRain {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String str = sc.next();
        int count = 0;
        int maxCount = 0;
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (ch == 'R') {
                count++;
                maxCount = Math.max(maxCount, count);
            } else if (ch == 'S') {
                count = 0;
            }
        }
        System.out.println(maxCount);
    }
}
