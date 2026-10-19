
import java.util.Scanner;

public class ACookies {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        
        int totalSum = 0;
        int oddCount = 0;
        int evenCount = 0;
        
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            totalSum += val;
            
            if (val % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        
        if (totalSum % 2 == 0) {
            System.out.println(evenCount);
        } else {
            System.out.println(oddCount);
        }
    }
}
