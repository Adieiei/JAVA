import java.util.Scanner;

public class Password {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        if(s.length() < 8){
            System.out.println("Invalid");
        } else {
            // 1. Create flags to remember what we have seen
            boolean hasNumber = false;
            boolean hasUpper = false;
            boolean hasLower = false;
            
            // 2. Look at every character one by one
            for(int i = 0; i < s.length(); i++){
                char ch = s.charAt(i);
                
                // If we see a specific type, flip its flag to true
                if(ch >= '0' && ch <= '9') {
                    hasNumber = true;
                } else if (ch >= 'A' && ch <= 'Z') {
                    hasUpper = true;
                } else if (ch >= 'a' && ch <= 'z') {
                    hasLower = true;
                }
            }
            
            // 3. AFTER the loop finishes, check if all flags became true
            if(hasNumber && hasUpper && hasLower){
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
        
        sc.close();
    }
}