import java.util.Scanner;

public class CF443ABETTER{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        
        // Array to mark which letters we have seen
        boolean[] seen = new boolean[26];
        int uniqueCount = 0;
        
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            
            // If it's a lowercase letter
            if (ch >= 'a' && ch <= 'z') {
                int index = ch - 'a'; // Maps 'a' to 0, 'b' to 1, ..., 'z' to 25
                
                // If we haven't seen this letter before
                if (!seen[index]) {
                    seen[index] = true; // Mark it as seen
                    uniqueCount++;      // Increase our distinct count
                }
            }
        }
        
        System.out.println(uniqueCount);
    }
}