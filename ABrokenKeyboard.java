import java.util.Scanner;
public class ABrokenKeyboard{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //String[] str = new String[n];
        int c = 0;
        String s;
        int t = sc.nextInt();
        while(t-->0){
            String rec = sc.next();
            boolean[] working = new boolean[26];
           // int n = rec.length();
            for(int i=0;i<rec.length();i++){
                int j = i;
                while(j < rec.length() && rec.charAt(j) == rec.charAt(i)){
                    j++;
                }
                 int length = j-i;
                 if(length%2 != 0){
                    working[rec.charAt(i) - 'a'] = true;
                 }

         i = j - 1; 
            }
            
            // Build the result string alphabetically
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < 26; i++) {
                if (working[i]) {
                    result.append((char) (i + 'a'));
                }
            }
            
            System.out.println(result.toString());
        }
        sc.close();
    }
}
    
