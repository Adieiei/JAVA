import java.util.Scanner;

public class ASumOfRoundNumbers{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            
            while (t-- > 0) {
                int n = sc.nextInt();
                int[] roundNumbers = new int[5];
                int count = 0;
                int multiplier = 1;
                
                while (n > 0) {
                    int digit = n % 10;
                    
                    if (digit != 0) {
                        roundNumbers[count] = digit * multiplier;
                        count++;
                    }
                    
                    n /= 10;
                    multiplier *= 10;
                }
                
                System.out.println(count);
                for (int i = 0; i < count; i++) {
                    System.out.print(roundNumbers[i] + (i == count - 1 ? "" : " "));
                }
                System.out.println();
            }
        }
    }
