import java.util.*;
public class ATurnIntoAPalindrome {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            char ch = sc.next().charAt(0);
            String s = sc.next();
            int cont = 0;
            for(int i=0;i<n/2;i++){
                char left = s.charAt(i);
                char right = s.charAt(n-i-1);
                if(left != right){
                    if(left == ch || right == ch){
                        cont += 1;
                    }else{
                        cont +=2;
                    }
                    }
                }
                System.out.println(cont);
            }
        }
    }


