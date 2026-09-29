import java.util.*;
public class GCD {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        while(B>0){
        int rem = A%B;
        A = B;
        B = rem;
        }
        System.out.println(A);
    }
    
}
