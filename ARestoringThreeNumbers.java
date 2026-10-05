import java.util.*;
public class ARestoringThreeNumbers{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        long[] arr = new long[4];
        for(int i=0;i<4;i++){
            arr[i] = sc.nextLong();
        }
        Arrays.sort(arr);
       
        long a = arr[3] - arr[0];
        long b = arr[3] - arr[1];
        long c = arr[3] - arr[2];
        System.out.print(a+" ");
        System.out.print(b+" ");
        System.out.print(c);
        
        
    }
}