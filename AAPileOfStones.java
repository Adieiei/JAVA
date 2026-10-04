import java.util.*;
public class AAPileOfStones{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
            String s = sc.next();
            int count = 0;
            for (int i = 0; i <n; i++) {
                char ch = s.charAt(i);
                if (ch == '+') {
                    count += 1;
                }else if(ch == '-'){
                    if(count > 0){
                        count --;
                }

            }
            }
    
        
        System.out.println(count);
    }
}