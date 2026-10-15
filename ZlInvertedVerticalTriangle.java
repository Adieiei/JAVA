import java.util.Scanner;

public class ZlInvertedVerticalTriangle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int cols = 1;
        
        for (int i = 1; i <= 2 * n - 1; i++) {
            for (int j = 1; j <= cols; j++) {
                if (j == 1 || j == cols) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            
            System.out.println();
            if (i < n) {
                cols +=2;
            } else {
                cols-=2;;
            }
        }
    }
}