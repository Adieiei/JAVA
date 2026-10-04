import java.util.*;
public class ASumOfOddIntegers{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while(t-->0){
            long n = sc.nextLong();
            long k = sc.nextLong();
            if(n%2 == k%2 && n>=k*k){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}