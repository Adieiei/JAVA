import java.util.*;

public class ASpellCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String target = "Timru"; 
        
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            String s = sc.next();
            
            if (n != 5) {
                System.out.println("NO");
            } else {
                char[] arr = s.toCharArray();
                Arrays.sort(arr);
                String sortedS = new String(arr);
                
                if (sortedS.equals(target)) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
        sc.close();
    }
}